package Level003;

import java.util.Scanner;
public class JPA310
{
	static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) 
    {	int n, sum = 0;
    	do
    	{
    		System.out.print("Input N (N > 0, N is even.):");
        	n = keyboard.nextInt();
    	}
    	while(n % 2 != 0 || n < 0);
    	
    	for(int i = 2; i <= n; i=i+2)
    		sum += i;
    	System.out.print("2 + 4 + … + " + n + " = " + sum);
    }
}
