import java.io.*;
import java.net.*;

public class ChatServer {
    private static ServerSocket serverSocket = null;
    private static Socket clientSocket = null;
    private static final int MaxClientsCount = 10;
    private static final clientThread[] threads = new clientThread[MaxClientsCount];

    public static void main(String[] args) {
        int port = 2222;
        if (args.length < 1) {
            System.out.println("Usage Java ChatServer <port>\n" + "Now uing port number = " + port);
        } else {
            port = Integer.valueOf(args[0]).intValue();
        }

        try {
            serverSocket = new ServerSocket(port);
        } catch (Exception e) {
            System.out.println(e);
        }

        while (true) {
            try {
                clientSocket = serverSocket.accept();
                int i;
                for (i = 0; i < MaxClientsCount; i++) {
                    if (threads[i] == null) {
                        threads[i] = new clientThread(clientSocket, threads);
                        threads[i].start();
                        break;
                    }
                }
                if (i == MaxClientsCount) {
                    PrintStream os = new PrintStream(clientSocket.getOutputStream());
                    os.println("Server too busy. try later");
                    os.close();
                    clientSocket.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class clientThread extends Thread {
    private DataInputStream is = null;
    private PrintStream os = null;
    private Socket clientSocket = null;
    private final clientThread[] threads;
    private int MaxClientsCount;

    public clientThread(Socket clientSocket, clientThread[] threads) {
        this.clientSocket = clientSocket;
        this.threads = threads;
        MaxClientsCount = threads.length;
    }

    public void run() {
        int MaxClientsCount = this.MaxClientsCount;
        clientThread[] threads = this.threads;

        try {
            is = new DataInputStream(clientSocket.getInputStream());
            os = new PrintStream(clientSocket.getOutputStream());
            os.println("Enter your name : ");
            String name = is.readLine().trim();
            os.println("Hello " + name + " to our chat room. \nTo leave enter quit in a new line");
            for (int i = 0; i < MaxClientsCount; i++) {
                if (threads[i] != null && threads[i] != this) {
                    threads[i].os.println("*** A new user " + name + " entered the chat room ***");
                }
            }
            while (true) {
                String line = is.readLine();
                if (line.startsWith("quit")) {
                    break;
                }
                for (int i = 0; i < MaxClientsCount; i++) {
                    if (threads[i] != null) {
                        threads[i].os.println(name + ">> " + line);
                    }
                }
            }

            for (int i = 0; i < MaxClientsCount; i++) {
                if (threads[i] != null && threads[i] != this) {
                    threads[i].os.println("***The user " + name + " is leaving***");
                }
            }
            os.println("***Bye " + name + " ***");

            for (int i = 0; i < MaxClientsCount; i++) {
                if (threads[i] == this) {
                    threads[i] = null;
                }
            }

            is.close();
            os.close();
            clientSocket.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
