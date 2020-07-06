package Frame;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		JButton btn2 = new JButton("Action2");
		btn2.addActionListener(new MyActionListener());
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		c.add(btn2);
		setSize(350, 150);
		setVisible(true);	
	}
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			// InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
			InnerClassListener.this.setTitle(b.getText()); // 프레임 타이틀에
																	 //버튼 문자열을 출력한다.
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassListener();
	}

}
