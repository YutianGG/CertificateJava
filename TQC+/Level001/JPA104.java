package Level001;
import java.util.Scanner;

public class JPA104
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x1, x2, y1, y2, ans;
		System.out.print("輸入第1組的x和y座標：");
		x1 = sc.nextInt();		y1 = sc.nextInt();
		System.out.print("輸入第2組的x和y座標：");
		x2 = sc.nextInt();		y2 = sc.nextInt();
		ans = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		System.out.printf("%.2f",ans);
	}

}
