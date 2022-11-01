package Level004;

import java.util.Scanner;
public class JPA403 
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) 
    {
    	System.out.print("Input m:");
    	int m = keyboard.nextInt(), n;
    	
    	while(m != 999) 
    	{
    		System.out.print("Input n:");
    		n = keyboard.nextInt();
    		
    		System.out.printf("Ans (尾端遞迴)：%d\n", power(m, n, 1));
    		System.out.printf("Ans (迴圈)：%d\n", powerLoop(m, n));
    		
    		System.out.print("Input m:");
        	m = keyboard.nextInt();
        }
    }
    
    static int power(int m, int n, int ans)
    {
    	if(n == 0)
    		return ans;
    	else
    		return power(m, n - 1, ans * m);
    }
    
    static int powerLoop(int m, int n) 
    {
    	int ans = 1;
    	
    	for(int i = 1;i <= n;i++)
    		ans *= m;
    	
    	return ans;
    }
}