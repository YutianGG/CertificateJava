package Level002;

import java.util.*;
public class JPA205 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        test();
        test();
        test();
        test();
    }
    static void test() 
    {
        System.out.println("Enter an integer:");
        int n = input.nextInt();
        
        if(n % 6 == 0)
        	System.out.println(n +"是2、3、6的倍數");
        else if(n % 3 == 0)
        	System.out.println(n +"是3的倍數");
        else if(n % 2 == 0)
        	System.out.println(n +"是2的倍數");
        else
        	System.out.println(n +"不是 2、3、6 的倍數");
    }
}