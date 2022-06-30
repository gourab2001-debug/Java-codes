import javax.swing.*;
import java.awt.*;

public class grid {
    grid() {
        JFrame frame = new JFrame(" GridLayout Example");

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        frame.setLayout(new GridLayout(2,2));
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new grid();
    }
}
