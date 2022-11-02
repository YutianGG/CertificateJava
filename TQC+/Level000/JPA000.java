package Level000;

public class JPA000 
{
	public static void main(String[] args) 
	{
		int a[][] = {{1,2},
					 {3,4}};	
		int b[][] = {{0,1},
				 	 {1,0}};		
		System.out.println("A");
		show(a);
		System.out.println("B");
		show(b);
		add(a,b);
		mlitiply(a,b);
	}
	static void add(int[][] a, int[][] b)
	{
		int[][] ans = new int[a.length][a[0].length];
		
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j< a[i].length; j++)
				ans[i][j] = a[i][j] + b[i][j];
		show(ans);
	}
	static void mlitiply(int[][] a, int[][] b)
	{
		int[][] ans = new int[a.length][b[0].length];
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j< a[i].length; j++)
				for(int k = 0; k< b[i].length; k++)
					ans[i][j] += a[i][k] * b[k][j];
		show(ans);
	}
	static void show(int[][] ans)
	{
		for(int i = 0; i < ans.length; i++)
		{
			for(int j = 0; j< ans[i].length; j++)
				System.out.print(ans[i][j] + " ");
			System.out.println();
		}
		System.out.println("===");
	}
}
