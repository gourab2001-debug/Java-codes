import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 2020);
            System.out.println(s);
            DataOutputStream d1 = new DataOutputStream(s.getOutputStream());
            d1.writeUTF("Hello Server");
            d1.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
