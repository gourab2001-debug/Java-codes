import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class URLDemo {
    public static void main(String[] args) throws Exception {
        new MyFrame();
    }
}

class detailsFrame extends Frame {
    public detailsFrame(String url2) throws MalformedURLException {
        URL url = new URL(url2);
        this.setSize(500, 300);
        this.setLayout(null);
        this.setTitle(url.toString());

        Label protocol = new Label("Protocol : " + url.getProtocol());
        Label host = new Label("Host : " + url.getHost());
        Label port = new Label("Port No : " + url.getPort());
        Label file = new Label("File Name : " + url.getFile());

        protocol.setBounds(50, 50, 300, 20);
        host.setBounds(50, 100, 300, 20);
        port.setBounds(50, 150, 300, 20);
        file.setBounds(50, 200, 300, 20);

        this.add(protocol);
        this.add(host);
        this.add(port);
        this.add(file);

        this.setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}

class MyFrame extends Frame {
    public MyFrame() {
        this.setSize(500, 200);
        this.setLayout(null);
        Label address = new Label("Enter address: ");
        address.setBounds(50, 50, 200, 20);
        TextField tf = new TextField();
        tf.setBounds(270, 50, 200, 20);
        Button submit = new Button("submit");
        submit.setBounds(225, 100, 50, 50);
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String addr = tf.getText();
                try {
                    dispose();
                    new detailsFrame(addr);
                    System.out.println(addr);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        });

        this.add(address);
        this.add(tf);
        this.add(submit);

        this.setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }
}
