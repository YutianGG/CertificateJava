package Level004;

import java.util.Scanner;
public class JPA402
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[])
    {
    	int n;
    	do 
    	{
    		System.out.print("Input n (0 <= n <= 16):");
    		n = keyboard.nextInt();
    		
    		if(n >= 0 && n <= 16)
    		{
    			System.out.printf("%d 的階乘(尾端遞迴) = %d\n", n,factorial(n, 1));
    			System.out.printf("%d 的階乘(迴圈) = %d\n", n,factorialLoop(n));
    		}
    	} while(n != 999);
    }
    static int factorial(int n, int ans)
    {
    	if(n == 1)
    		return ans;
    	else
    		return factorial(n - 1, n * ans);
    }
    static int factorialLoop(int n) 
    {
    	int ans = 1;
    	
    	for(int i = 2;i <= n;i++)
    		ans *= i;
    	
    	return ans;
    }
}