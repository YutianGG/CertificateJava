package Level002;

import java.util.*;
public class JPA207
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) 
    {
        test();        
        test();
        test();
        test();
    }
    static void test() 
    {
    	int	data[] = new int[3];
        System.out.print("請輸入三個整數：");
        data[0] = keyboard.nextInt();
        data[1] = keyboard.nextInt();
        data[2] = keyboard.nextInt();
        Arrays.sort(data);
        
        int a = data[0], b = data[1], c = data[2]; 
        if(a + b > c && a != 0 && b != 0 && c!= 0)
        {
        	if(a*a + b*b == c*c)
        		System.out.println("直角三角形");
        	if(a*a + b*b < c*c)
        		System.out.println("鈍角三角形");
        	if(a*a + b*b > c*c)
        		System.out.println("銳角三角形");
        }
        else 	System.out.println("不可以構成三角形");
    }
}
