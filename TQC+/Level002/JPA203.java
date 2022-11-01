package Level002;

import java.util.*;
public class JPA203 
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) 
    {
        test();
        test();
    }
    
    static void test() 
    {
        System.out.println("Input an integer:");
        if(input.nextInt()%2 == 0)
        	System.out.println("The number is even.");
        else
        	System.out.println("The number is odd.");
    }
}
