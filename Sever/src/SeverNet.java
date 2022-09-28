import java.io.*;
import java.net.*;

public class SeverNet 
{
	public static void main(String[] args)
	{
		try 
		{
			ServerSocket server = new ServerSocket(1314);
			System.out.println("Connecting...");
			Socket s = server.accept();
			System.out.println("IP: "+ s.getInetAddress());
			DataInputStream dis = 
					new DataInputStream(s.getInputStream());
			String text = new String(dis.readUTF());
			System.out.println(text);
			
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
