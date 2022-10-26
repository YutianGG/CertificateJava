import java.util.Scanner;
public class JPA303
{
	public static void main(String[] args)
	{
		int num, sum = 0;
		System.out.printf("1~1000中的完美數有: ");
		for (int i = 1; i <= 1000; i++)
		{
			num = i;
			sum = 0;
			for (int j = 1; j < i; j++) 
			{
				if(i % j == 0)	
					sum += j;
			}
			if (num == sum) 	
				System.out.printf("%d ",num);
		}
	}
}