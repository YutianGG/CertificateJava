package Level004;

import java.util.Scanner;
public class JPA401 
{
	static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) 
    {
    	int n = 0;
    	
    	System.out.print("Input n (0 <= n <= 16):");
		n = keyboard.nextInt();
    	while(n != 999)
    	{
    		System.out.println(n + " 的階層 = " + f(n));
    		System.out.print("Input n (0 <= n <= 16):");
    		n = keyboard.nextInt();
    	}
    }
    static int f(int n)
    {
    	if(n == 1)
    		return 1;
    	else
    		return n*f(n-1);
    }
}
