package Level003;

import java.util.Scanner;
public class JPA305 
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) 
    {
        test();
        test();
        test();
    }
    public static void test() 
    {
        System.out.print("Please enter one value:");
        int ans = 1, n = keyboard.nextInt();
        if(n >= 1 && n <= 10)
        {
        	for(int i = 1; i <= n; i++)
        		ans *= i;
        	System.out.println(n + "! = " + ans);
        } 	 
        else
        	System.out.println("Error, the value is out of range.");		
    }
}
