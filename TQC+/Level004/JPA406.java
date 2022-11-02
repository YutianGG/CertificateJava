package Level004;

import java.util.Scanner;
public class JPA406 
{
	static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) 
    {
    	System.out.print("Input a string: ");
    	String str = keyboard.nextLine();
    	System.out.println(str.substring(1));
    	//System.out.println("Has " + countA(str) + " As.");
    }
    
    public static int countA(String str) 
    {
    	if(str.length() == 0)
    		return 0;
    	else if(str.charAt(0) == 'A')	
    		return 1 + countA(str.substring(1));
    	System.out.println(str.substring(1));
    	return countA(str.substring(1));
    }
}
