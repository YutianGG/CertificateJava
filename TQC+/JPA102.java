import java.util.Scanner;

public class JPA102
{
	public static void main(String[] args) 
	{
		System.out.print("Please input:");
		double kg = new Scanner(System.in).nextDouble();
		System.out.printf("%.6f kg = %.6f ponds \n", kg, kg * 2.20462);
	}
}
