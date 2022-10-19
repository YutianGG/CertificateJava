import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class Image
{
	public static void main(String[] args) throws IOException 
	{
		Frame f = new Frame();
	}
}
class Frame extends JFrame
{
	ImageCanvas image;
	public Frame() throws IOException 
	{
		setSize(800,600);
		setLocation(500,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		image = new ImageCanvas();
		image.setBounds(0, 0, 800, 600);
		add(image);
		setLayout(null);
	}
}
class ImageCanvas extends Canvas
{
	File f;
	BufferedImage bi;
	public ImageCanvas() throws IOException
	{
		f = new File("C:\\Users\\CSIE-404\\Desktop\\ImageReader\\Tekken.jpg");
		bi = ImageIO.read(f);
	}
	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
		g.drawImage(bi, 150, 130, null);
	}
}
