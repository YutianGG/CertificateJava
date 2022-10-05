import java.awt.Color;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class MsgServer 
{
	public static void main(String[] args)
	{	
		new Server();
	}
}

class MsgFrame extends JFrame 
{
	JTextArea t_area01;
	public MsgFrame()
	{
		setSize(400,110);
		setLocation(100,300);
		//set text_area
		t_area01 = new JTextArea();
		t_area01.setBounds(10, 10, 360, 50);
		t_area01.setBackground(Color.PINK);
		
		setLayout(null);
		add(t_area01);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

class Server
{
	ServerSocket server;
	MsgFrame msg;
	public Server()
	{
		msg = new MsgFrame();
		try 
		{
			server = new ServerSocket(1314);
			Socket s = server.accept();
			DataInputStream dis = 
					new DataInputStream(s.getInputStream());
			String text = new String(dis.readUTF());
			msg.t_area01.setText(text);
			//close
			s.close();
			dis.close();
			server.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} 
	}
}
