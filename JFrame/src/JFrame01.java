import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrame01
{
	public static void main(String[] args)
	{
		new Frame();
	}
}
class Frame extends JFrame implements ActionListener
{
	JButton button1, button2, button3;
	public Frame()
	{
		setBounds(100, 100, 800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set button 01
		button1 = new JButton("Touch Me!");
		button1.setBounds(100, 100, 100, 50);
		button1.addActionListener(this);
		//set button 02
		button2 = new JButton("Press Me!");
		button2.setBounds(250, 100, 100, 50);
		button2.addActionListener(this);
		//set button 03
		button3 = new JButton();
		button3.setBounds(100, 200, 250, 250);
		
		//add button 
		setLayout(null);
		add(button1);
		add(button2);
		add(button3);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button1)
			button3.setBackground(Color.RED);
		if(e.getSource() == button2)
			button3.setBackground(Color.BLUE);
	}
}
