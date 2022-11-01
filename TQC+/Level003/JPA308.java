package Level003;

import java.util.Scanner;
public class JPA308 
{
	static Scanner keyboard = new Scanner(System.in);
    static int i = -1;
    public static void main(String[] args)
    {
        int total = 0, s = 0;
        
		do 
		{
			System.out.print("Input the value,or input -1 to end:");
	        s = keyboard.nextInt();
	        total += s;
		}
		while(s != i);
		total++;
	    System.out.println("電腦週邊總消費：" + total);

    }
}

/*
import java.util.Scanner;
public class JPD03 {
    static Scanner keyboard = new Scanner(System.in);
    static int i = -1;
    public static void main(String[] args) {
        int total = 0, s = 0;
        

	...


    }
}
*/