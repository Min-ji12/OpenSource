package HW09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

public class test1 extends JFrame {
	public test1() {
		setTitle("드래깅동안 YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.GREEN);
		
		c.addMouseListener(new mouseListener());
		c.addMouseMotionListener(new motionListener());
		setSize(300,300);
		setVisible(true);
	}
	
	public class motionListener extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			Container c=(Container)e.getSource();
			c.setBackground(Color.yellow);
		}
	}
	
	public class mouseListener extends MouseAdapter{
		public void mouseReleased(MouseEvent e) {
			Container c=(Container)e.getSource();
			c.setBackground(Color.GREEN);
		}
	}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test1();
	}
}

