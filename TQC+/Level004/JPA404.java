package Level004;

import java.util.Scanner;
public class JPA404 
{
	static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) 
    {
    	int m, n;
    	System.out.print("Input m:");
    	m = keyboard.nextInt();
    	while(m != 999)
    	{
        	System.out.print("Input n:");
        	n = keyboard.nextInt();
        	System.out.println("GCD is " + GCD(m, n));
        	System.out.print("Input m:");
        	m = keyboard.nextInt();
    	}
    	
    }
    static int GCD(int m, int n)
    {
    	if(n == 0)
    		return m;
    	return m%n == 0 ? n:GCD(m, m%n);
    }
}
