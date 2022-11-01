package Level002;

import java.util.Scanner;
public class JPA201 
{
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        test();
        test();
    }
    
    public static void test() 
    {
        System.out.print("Please enter score:\n");
        if(keyboard.nextInt() >= 60)
        {
        	System.out.print("You pass\n");
        }
        System.out.print("End");
    }
}
