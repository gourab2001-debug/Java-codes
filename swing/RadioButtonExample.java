// import java.awt.event.*;
import javax.swing.*;
public class RadioButtonExample {
    RadioButtonExample(){
        JFrame f = new JFrame("Food Ordering system");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(400, 330);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(100, 50, 200, 30 );
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(100, 100, 200, 30 );
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        f.add(male);
        f.add(female);

        f.setVisible(true);
    }
    public static void main(String[] args) {
        new RadioButtonExample();
    }
}
