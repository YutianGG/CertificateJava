package Level000;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPA001 
{
	public static void main(String[] args) 
	{
		new Frame();
	}
}
class Frame extends JFrame implements ActionListener
{
	Button button;
	Panel panel;
	int k = 0;
	public Frame()
	{
		setSize(400, 600);
		setLocation(100, 200);
		button = new Button("Press");
		panel = new Panel();
		button.setBounds(10, 450, 365, 100);
		button.addActionListener(this);
		panel.setBounds(45,100,400,500);
		add(button);
		add(panel);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		k ++;
		panel.update(k%4);
	}
}
class Panel extends JPanel
{
	int k;
	Color c[] = {Color.BLUE, Color.RED, Color.GREEN, Color.BLACK};
	public Panel()
	{
		k = 0;
	}
	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
		g.setColor(c[k]);
		g.fillOval(0, 0, 300, 300);
	}
	public void update(int k)
	{
		this.k = k;
		repaint();
	}
}
