import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class MsgClient
{
	public static void main(String[] args)
	{	
		MsgFrame mf = new MsgFrame();
	}
}
class MsgFrame extends JFrame implements ActionListener
{
	JButton button01;
	JTextArea t_area01;
	Client clinet;
	public MsgFrame()
	{
		setSize(400,110);
		setLocation(100,120);
		//set button
		button01 = new JButton("Send");
		button01.setBounds(310, 10, 70, 50);
		button01.addActionListener(this);
		//set text_area
		t_area01 = new JTextArea();
		t_area01.setBounds(10, 10, 300, 50);
		setLayout(null);
		add(button01);
		add(t_area01);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		clinet = new Client("127.0.0.1", 1314);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String msg = t_area01.getText().toString();
		clinet.SendMsg(msg);
	}
}

class Client
{
	String address;
	int port;
	Socket s;
	public Client(String addr,int port)
	{
		super();
		this.address = address;
		this.port = port;
	}
	public void SendMsg(String msg) 
	{
		try 
		{
			s = new Socket(address,port);
			DataOutputStream dos = 
					new DataOutputStream(s.getOutputStream());
			dos.writeUTF(msg);
			dos.flush();
			dos.close();
			s.close();
		} 
		catch (UnknownHostException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}	
}
