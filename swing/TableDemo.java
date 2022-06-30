import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class TableDemo {
    JFrame frame;
    TableDemo(){
        frame = new JFrame();
        frame.setSize(300, 300);
        frame.setBackground(Color.CYAN);
        frame.setResizable(false);
        JLabel login = new JLabel("Login Form");
        JLabel username = new JLabel("Username : ");
        JLabel password = new JLabel("Password : ");
        JTextField usernameTxt = new JTextField();
        JTextField passwordTxt = new JTextField();
        JButton submitBtn = new JButton("Submit");

        login.setBounds(100, 20, 100, 20);
        username.setBounds(50, 90, 90, 20);
        password.setBounds(50, 120, 90, 20);
        usernameTxt.setBounds(150, 90, 100, 20 );
        passwordTxt.setBounds(150, 120, 100, 20);
        submitBtn.setBounds(100, 160, 100, 30);

        frame.add(login);
        frame.add(username);
        frame.add(usernameTxt);
        frame.add(password);
        frame.add(passwordTxt);
        frame.add(submitBtn);

        submitBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Hello "+usernameTxt.getText());
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new TableDemo();
    }
}
