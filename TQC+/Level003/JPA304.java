package Level003;

import java.util.Scanner;
public class JPA304 
{
	static Scanner input = new Scanner(System.in); 
    public static void main(String[] args) 
    {
        int total = 0;
        int s = 0;
        int count = 0;
        double average;
        
        System.out.print("Please enter meal dollars or enter -1 to stop: ");
        s = input.nextInt();
        while(s != -1)
        {
        	count++;
        	total += s;
        	System.out.print("Please enter meal dollars or enter -1 to stop: ");
        	s = input.nextInt();        
        }
        average = total / count;
        System.out.println("餐點總費用:" + total);
        System.out.printf(" %d 道餐點平均費用為: %.2f %n", count, average);
    }
}
