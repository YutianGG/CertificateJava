import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Class 
{
	public static void main(String[] args) throws IOException 
	{	
		Frame frame = new Frame();
	}
}
class Frame extends  JFrame  implements ActionListener 
{
	JButton button;
	TextArea area;
	String text;
	FileReader fr;
	BufferedReader br;
	
	public Frame() throws IOException
	{
		fr = new FileReader("C:\\Users\\CSIE-404\\Desktop\\Reader\\Score.txt");
		br = new BufferedReader(fr);
		setSize(800,600);
		setLocation(500,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Press");
		button.setBounds(10, 10, 200, 50);
		button.addActionListener(this);
		area = new TextArea();
		area.setBounds(10, 70, 765, 475);
		add(button);
		add(area);
		setLayout(null);
	}
	public String readtext() 
	{
		try 
		{
			text = br.readLine();
		} 
		catch (IOException e)
		{	
			e.printStackTrace();
		}
		return text;
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{	int total = 0;
		readtext();
		if(text != null)
		{
			for(int i = 1; i<=3; i++)
			{
				String s[] = text.split("\\s+");
				total += Integer.parseInt(s[i]);
			}
			area.setText(text +"\nTotal:"+total);
		} 	
	}
}
