package Level001;

public class JPA108 
{	
	public static void main (String[] args)
	{
		  int i = add(2, 3);
		  double d = add(5.2, 4.3);
		  String s = add("I love ", "Java!!");
		  System.out.printf("%d %f %s %n", i, d, s);
	}
	
	public static int add(int i, int j)
	{	
		System.out.printf("Adding two integers: %d,%d\n", i,j);
		return i + j;
	}
	public static double add(double i, double j)
	{	
		System.out.printf("Adding two integers: %.1f,%.1f\n", i,j);
		return i + j;
	}
	public static String add(String i, String j)
	{	
		System.out.printf("Adding two integers: %s,%s\n", i,j);
		return i + j;
	}
	
}

/*
class JPD01 {

...

public static void main (String[] args) {
  int i = add(2, 3);
  double d = add(5.2, 4.3);
  String s = add("I love ", "Java!!");
  System.out.printf("%d %f %s %n", i, d, s);
}
}
*/