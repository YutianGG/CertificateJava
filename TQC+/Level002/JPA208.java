package Level002;

import java.util.*;
public class JPA208 
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
        System.out.println("Input:");
        int grade = keyboard.nextInt();
        String str = "Your grade is ";
        
        if(grade >= 90)
        	System.out.println(str + "A");
        else if(grade >= 80)
        	System.out.println(str + "B");
        else if(grade >= 70)
        	System.out.println(str + "C");
        else if(grade >= 60)
        	System.out.println(str + "D");
        else
        	System.out.println(str + "F");
    }
}
