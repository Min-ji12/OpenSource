package chap10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ex10_2 extends JFrame{
	ex10_2(){
		setTitle("Action 이벤트리스너예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn= new JButton("Action");
		btn.addActionListener(new MyActionListener2());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	private class  MyActionListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			ex10_2.this.setTitle(b.getText());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ex10_2();
	}
}
