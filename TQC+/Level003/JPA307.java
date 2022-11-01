package Level003;

import java.io.*;
import java.util.Scanner;
public class JPA307 
{
	public static void main (String argv[]) throws IOException
	{
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("Input:"); 
		num1 = input.nextInt();
		while(num1 != 999)
		{
			num2 = input.nextInt();
			System.out.println(GCD(num1, num2)); 
			System.out.println("Input:"); 
			num1 = input.nextInt();
		}
	}
	public static int GCD(int m, int n) 
	{
		int result;
		if(m % n == 0)
			result = n;
		else
			result = GCD(n, m % n);
		return result;
	}
}
/*
import java.io.*;
public class JPD03 {
    public static void main (String argv[]) throws IOException {
        int num1, num2;
  
        
        System.out.println("Input:"); 
        
        while (___________) {
            



        }
    }  
  
    static int gcd (int m, int n) {
        int result;
        while (__________){
            


        }
        
    }
}
*/