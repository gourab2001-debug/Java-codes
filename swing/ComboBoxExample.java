import javax.swing.*;

public class ComboBoxExample {
    ComboBoxExample() {
        JFrame f = new JFrame("Food Ordering system");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(400, 330);

        String[] countries = { "India", "Bangladesh", "Australia", "America" };
        final JComboBox jcb = new JComboBox(countries);
        jcb.setBounds(50, 50, 200, 30);
        jcb.setEditable(true);
        f.add(jcb);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxExample();
    }
}
