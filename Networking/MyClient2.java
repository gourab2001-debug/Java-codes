import java.io.*;
import java.net.*;

public class MyClient2 {
    Socket s;
    DataInputStream din;
    DataOutputStream dout;
    public MyClient2(){
        try {
            s = new Socket("localhost",2020);
            System.out.println(s);
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            clientChat();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void clientChat () throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1;
        do {
            s1 = br.readLine();
            dout.writeUTF(s1);
            dout.flush();
            System.out.println("Server Message: "+din.readUTF());
        }
        while(!s1.equals("stop"));
    }
    public static void main(String[] args) {
        new MyClient2();
    }
}
