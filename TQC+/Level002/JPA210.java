package Level002;

import java.util.*;
public class JPA210 
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        test();
        test();
        test();
        test();
        test();
    }
    public static void test()
    {
        System.out.println("Input a character:");
        String key = keyboard.next();
        
        switch (key)
        {
        	case "a":
        		System.out.println("You entered a or b");
        		break;
        	case "b":
        		System.out.println("You entered a or b");	
        		break;
        	case "x":
        		System.out.println("You entered x");
        		break;
        	case "y":
        		System.out.println("You entered y");
        		break;
        	default:
        		System.out.println("You entered something else.");	
        }   
    }
}