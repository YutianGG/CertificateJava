import java.io.*;
import java.net.*;

public class ClientNet 
{
	public static void main(String[] args)
	{
		try
		{
			Socket clinet = new Socket("127.0.0.1", 1314);
			DataOutputStream dos = 
					new	DataOutputStream(clinet.getOutputStream());
			dos.writeUTF("Hello World!!");
			
			dos.close();
			clinet.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
