import java.io.*;
import java.net.*;

public class ChatClient implements Runnable {
    private static Socket clientsocket = null;
    private static PrintStream os = null;
    private static DataInputStream is = null;
    private static BufferedReader br = null;
    private static boolean closed = false;

    public static void main(String[] args) {
        int port = 2222;
        String host = "localhost";
        if (args.length < 2) {
            System.out.println(
                    "Usage: java ChatClient <host> <port>\n" + "Now using host = " + host + ", port = " + port);
        } else {
            host = args[0];
            port = Integer.valueOf(args[1]).intValue();
        }

        try {
            clientsocket = new Socket(host, port);
            br = new BufferedReader(new InputStreamReader(System.in));
            os = new PrintStream(clientsocket.getOutputStream());
            is = new DataInputStream(clientsocket.getInputStream());
        } catch (Exception e) {
            System.out.println(e);
        }

        if (clientsocket != null && os != null && is != null) {
            try {
                new Thread(new ChatClient()).start();
                while (!closed) {
                    os.println(br.readLine().trim());
                }
                os.close();
                is.close();
                clientsocket.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    @Override
    public void run() {
        String responeLine;
        try {
            while ((responeLine = is.readLine()) != null) {
                System.out.println(responeLine);
                if (responeLine.indexOf("***Bye") != -1)
                    break;
            }
            closed = true;
        } catch (Exception e) {
            System.err.println(e);
        }

    }

}