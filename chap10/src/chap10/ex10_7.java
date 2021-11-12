package chap10;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ex10_7 extends JFrame {
private JLabel la = new JLabel();
	
	public ex10_7() {
		setTitle("key Code 예제 : f1 키 - 초록색, %키 - 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			la.setText(e.getKeyText(e.getKeyCode()));
		
			if(e.getKeyChar() == '%') {
				contentPane.setBackground(Color.YELLOW);
			}
			else if(e.getKeyCode() == KeyEvent.VK_F1) {
				contentPane.setBackground(Color.GREEN);
			}
		}
	}
		
	public  static  void  main (String[] args) {
		new  ex10_7();
	}

	
}
