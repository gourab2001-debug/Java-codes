import java.io.*;
import java.net.*;
public class MyServer2 {
    ServerSocket ss;
    Socket s;
    DataInputStream din;
    DataOutputStream dout;
    MyServer2(){
        try {
            ss = new ServerSocket(2020);
            System.out.println("Server Started");
            s = ss.accept();
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            serverChat();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void serverChat() throws IOException {
        String str;
        do{
            str = din.readUTF();
            System.out.println("Client Message " + str);
            dout.writeUTF(str);
            dout.flush();
        } while(!str.equals("stop"));
    }
    public static void main(String[] args) {
        new MyServer2();
    }
}
