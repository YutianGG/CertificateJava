package Level005;
import java.util.Scanner;
public class JPA501 {
	public static void main(String args[])
	{
		int n = 0, sum = 0;
		int[] number = new int[10];
		System.out.println("�п�J10�Ӿ�ơG");
		for(int i = 0;i < 10;i++) 
		{
			System.out.printf("��%d�Ӿ�ơG", i + 1);
			number[i] = new Scanner(System.in).nextInt();
		}
		for(int N : number)
		{
			if(N > 60) 
			{
				n++;
				sum += N;
			}
		}
			System.out.println("�}�C���j��60����" + n + "��\n�`�X��" + sum + "\n�����Ȭ�" + (sum / (double)n));
	}
}

