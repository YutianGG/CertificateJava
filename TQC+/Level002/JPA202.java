package Level002;

import java.util.*;
public class JPA202 
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) 
    {
        test();
        test();
    }
    
    public static void test() 
    {
        System.out.print("Input:\n");
        int a = keyboard.nextInt(), b = keyboard.nextInt();
        
        if(a > b)
        	System.out.printf("%d is larger than %d \n", a,b);
        else if(b > a)
        	System.out.printf("%d is larger than %d \n", b,a);
    }
}