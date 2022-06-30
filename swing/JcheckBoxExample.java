import java.awt.event.*;
import javax.swing.*;

public class JcheckBoxExample {
    JcheckBoxExample() {
        JFrame f = new JFrame("Food Ordering system");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(400, 330);

        JLabel lbl = new JLabel("Place your order now");

        JCheckBox p = new JCheckBox("Order Pizza @99");
        JCheckBox b = new JCheckBox("Order Burger @59");
        JCheckBox c = new JCheckBox("Order Coffee @29");
        JButton btn = new JButton("Place Order");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float amt = 0;
                String msg = "";
                if (p.isSelected()) {
                    amt += 99;
                    msg += "Pizza : 99\n";
                }
                if (b.isSelected()) {
                    amt += 59;
                    msg += "Burger : 59\n";
                }
                if (c.isSelected()) {
                    amt += 29;
                    msg += "Coffee : 29\n";
                }
                JOptionPane.showMessageDialog(null, msg + "------------\n" + "Total : " + amt);
            }
        });

        lbl.setBounds(100, 30, 200, 30);
        p.setBounds(100, 80, 200, 30);
        b.setBounds(100, 130, 200, 30);
        c.setBounds(100, 180, 200, 30);
        btn.setBounds(100, 230, 200, 30);

        f.add(lbl);
        f.add(p);
        f.add(b);
        f.add(c);
        f.add(btn);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JcheckBoxExample();
    }
}
