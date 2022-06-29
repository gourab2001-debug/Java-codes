import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException {

        // factory method to create an INET address object
        InetAddress address = InetAddress.getLocalHost(); // Returns the system details
        String addStr = address.toString();
        // System.out.println(address);
        InetAddress address2 = InetAddress.getByName("www.facebook.com"); // Returns the address of the website
        String addStr2 = address2.toString();
        MyFrame frame = new MyFrame("Inet Address example", addStr, addStr2);
        // System.out.println(address);
        // InetAddress ia[] = InetAddress.getAllByName("www.google.com");
        // for (int i = 0; i < ia.length; i++) {
        //     System.out.println(ia[i]);
        // }
    }
}

class MyFrame extends Frame {
    public MyFrame(String titleString, String t1, String t2){
        this.setSize(400, 400);
        this.setTitle(titleString);
        Label l1 = new Label();
        Label l2 = new Label();
        l1.setText(t1);
        l2.setText(t2);
        l1.setBounds(50, 100, 400, 20);
        l2.setBounds(50, 140, 400, 20);
        this.add(l1);
        this.add(l2);

        this.setLayout(null);
        // Label l3 = new Label();

        // TextField tf1 = new TextField();
        // TextField tf2 = new TextField();
        // TextField tf3 = new TextField();

        this.setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }
}