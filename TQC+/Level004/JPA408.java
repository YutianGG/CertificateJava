package Level004;

import java.util.Scanner;
public class JPA408 
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s, c; 
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.printf("%s\n", reverse(s));
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.printf("%s\n", reverse(s));
    }
    
    static String reverse(String str) {
    	if(str.equals(""))
    		return "";
    	return reverse(str.substring(1)) + str.substring(0, 1);
    }
}
