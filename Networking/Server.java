import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(2020);
            System.out.println("Server started");
            Socket s = ss.accept();
            System.out.println(s);
            DataInputStream ds = new DataInputStream(s.getInputStream());
            String msg = (String) ds.readUTF();
            System.out.println(msg);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
