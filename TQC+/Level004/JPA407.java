package Level004;

import java.util.Scanner;
public class JPA407 
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String args[]) 
	{
		String s; 
		System.out.print("Input a string of numbers: ");
		s = keyboard.nextLine();
		System.out.printf("§ÀºÝ»¼°j¡G%d\n", sumTail(s, 0));
		System.out.printf("°j°é¡G%d\n", sumLoop(s, 0));
		System.out.print("Input a string of numbers: ");
		s = keyboard.nextLine();
		System.out.printf("§ÀºÝ»¼°j¡G%d\n", sumTail(s, 0));
		System.out.printf("°j°é¡G%d\n", sumLoop(s, 0));
	}

	static int sumTail(String str, int ans)
	{
		if(str.length() == 0)
			return ans;
		
		return sumTail(str.substring(1), ans + Integer.parseInt(str.substring(0, 1)));
	}
	
	static int sumLoop(String str, int ans) 
	{
		for(int i = 0;i < str.length();i++)
			ans += Integer.parseInt(str.substring(i, i + 1));
		
		return ans;
	}
}
