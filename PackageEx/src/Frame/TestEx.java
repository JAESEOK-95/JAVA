package Frame;


import javax.swing.*;
import java.awt.*;

public class TestEx extends JFrame {
	public TestEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout grid = new GridLayout(5, 7);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);
for(int i =1; i<32; i++)
{
	c.add(new JButton(Integer.toString(i)));
}
		

		
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TestEx();
	}
}
