package Level003;

import java.io.*;
import java.util.Scanner;
public class JPA309 
{	static Scanner input = new Scanner(System.in);
    public static void main(String argv[]) throws IOException 
    {
    	int sum = 0, n = input.nextInt();
    	for(int i = 1; i <= n; i++)
    	{
    		if(i % 7 == 0)
    			continue;
    		if(i%3 == 0 || i%5 == 0)
    			sum += i;		
    	}
        System.out.println("Answer: " + sum);
    }
}