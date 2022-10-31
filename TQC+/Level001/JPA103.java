package Level001;
import java.util.Scanner;

public class JPA103 
{
	public static void main(String[] args) 
	{
		System.out.println("Please input:");
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		for(int i = 0; i < 3; i++)
			sum += sc.nextInt();
		System.out.printf("Average: %.2f", sum/3);
	}
}
