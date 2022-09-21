import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test 
{
	public static void main(String[] args)
	{
		new Frame();	
	}
}
class Frame extends JFrame implements ActionListener
{
	Panel panel;
	JButton button;
	public Frame() 
	{
		//Create size 800*600
		setSize(800,600);
		setLocation(500,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Create a button
		button = new JButton("Press");
		button.setFont(new Font("Arial", Font.BOLD, 18));
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		button.setBounds(100, 50, 200, 50);
		button.addActionListener(this);
		add(button);
		setLayout(null);
		
		//Use Panel
		panel = new Panel();
		panel.setBounds(50, 150, 700, 400);
		panel.setBackground(Color.PINK);
		add(panel);	
	}
	int i = 0;
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button)
		{	
			panel.update();
			panel.repaint();
		}		
		if(e.getSource() == button && i == 0)
			button.setBackground(Color.RED);
		else
			button.setBackground(Color.BLUE);
		i++;
		i = i % 2;
	}
}
class Panel extends JPanel
{	
	int x = 320, y = 100, xx = x, yy = y, a = -90, d = 100;
	double t = 0;
	public void update()
	{	
		a = a + 10;
		t =	(double)(a/180.) * Math.PI;
		xx =(int)(x + d * Math.cos(t));
		yy =(int)(y + d * Math.sin(t));
	}
	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
		Graphics2D gg = (Graphics2D) g;
		gg.setColor(Color.BLACK);
		gg.drawOval(xx, yy,30, 30);
		gg.fillOval(xx+5, yy+5, 20, 20);
	}
}