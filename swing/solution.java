// Java Program to Create a Simple JPanel and Adding Components to it
import java.awt.*;
// import java.awt.event.*;
import javax.swing.*;

class solution extends JFrame {
	static JFrame f;
	static JButton b, b1, b2;
	static JLabel l;
	public static void main(String[] args) {
		f = new JFrame("panel");
		l = new JLabel("panel label");
		b = new JButton("button1");
		b1 = new JButton("button2");
		b2 = new JButton("button3");
		JPanel p = new JPanel();
		p.add(b);
		p.add(b1);
		p.add(b2);
		p.add(l);
		p.setBackground(Color.red);
		f.add(p);
		f.setSize(300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
