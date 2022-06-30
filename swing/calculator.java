import java.awt.event.*;
import javax.swing.*;

public class calculator {
    calculator(){
        JFrame frame = new JFrame("Calculator");
        JLabel num1Lbl = new JLabel("Enter 1st number : ");
        JLabel num2Lbl = new JLabel("Enter 2nd number : ");
        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();

        JButton add = new JButton("ADD");
        JButton sub = new JButton("SUB");
        JButton div  = new JButton("DIV");
        JButton mul = new JButton("MUL");

        frame.add(num1Lbl);
        frame.add(num2Lbl);
        frame.add(num1);
        frame.add(num2);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
        new calculator();
    }
}
