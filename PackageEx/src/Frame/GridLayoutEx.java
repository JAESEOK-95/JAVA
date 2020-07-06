package Frame;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout grid = new GridLayout(4, 3);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);
		/*
		c.add(new JButton(" �̸�"));
		c.add(new JTextField(""));
		c.add(new JButton(" �й�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �а�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" ����"));
		c.add(new JTextField(""));
		*/
for(int i =0; i<10; i++)
{
	c.add(new JButton(Integer.toString(i)));
}
		

		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}
}