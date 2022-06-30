import java.awt.event.*;
import javax.swing.*;
public class Demo {
    public Demo(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(400, 400);

        JTextArea txt = new JTextArea(3, 0);
        txt.setLocation(100, 100);
        txt.setSize(100, 100);
        frame.add(txt);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Demo();
    }
}
