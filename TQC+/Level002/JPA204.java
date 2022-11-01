package Level002;

import java.util.*;
public class JPA204 
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        test();
        test();
    }
    public static void test() 
    {
    	System.out.println("Input:");
    	int n = input.nextInt();
    	
    	if(n % 5 == 0 && n % 9 == 0)
    		System.out.println("YES");
    	else
    		System.out.println("NO");
    }
}