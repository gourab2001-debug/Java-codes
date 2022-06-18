import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

class CreateLoginForm extends JFrame implements ActionListener {
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField textField1, textField2;

    CreateLoginForm() {

        userLabel = new JLabel();
        userLabel.setText("Username");
        textField1 = new JTextField(15);
        passLabel = new JLabel();
        passLabel.setText("Password");
        textField2 = new JPasswordField(15);
        b1 = new JButton("SUBMIT");
        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);
        add(newPanel, BorderLayout.CENTER);
        b1.addActionListener(this);
        setTitle("LOGIN FORM");
    }

    public void actionPerformed(ActionEvent ae) {
        String userValue = textField1.getText(); // get user entered username from the textField1
        String passValue = textField2.getText(); // get user entered password from the textField2

        // check whether the credentials are authentic or not
        if (userValue.equals("gourab") && passValue.equals("gourab@2001")) { 
            // if authentic, navigate user to a new page

            NewPage page = new NewPage();

            page.setVisible(true);

            // create a welcome label and set it to the new page
            JLabel wel_label = new JLabel("Welcome: " + userValue);
            page.getContentPane().add(wel_label);
        } else {
            System.out.println("Please enter valid username and password");
            JFrame page = new JFrame();
            page.setSize(100, 100);
            page.setVisible(true);
            page.setLayout(new FlowLayout());
            JLabel w_label = new JLabel("Invalid User !!!");
            page.getContentPane().add(w_label);
            JButton btn = new JButton("Ok");
            btn.setBounds(20, 20, 20, 20);
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    page.setVisible(false);
                }
            });
            page.add(btn);
        }
    }
}

class LoginFormDemo {
    public static void main(String arg[]) {
        try {
            CreateLoginForm form = new CreateLoginForm();
            form.setSize(300, 100);
            form.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
