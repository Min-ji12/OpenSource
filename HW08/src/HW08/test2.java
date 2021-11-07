package HW08;


import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test2 extends JFrame {
	public test2() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));

		Color[] colors = new Color[] { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE,
				Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY };
		
		for (int i=0;i<=9;i++) {
			JButton jbutton = new JButton(Integer.toString(i));
			jbutton.setBackground(colors[i]);
			c.add(jbutton);
		}
		setSize(450, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new test2();
	}
}