package Level003;

import java.util.*;
public class JPA301 {
	static Scanner input = new Scanner(System.in); 
    public static void main(String argv[]) 
    {
        System.out.println("Input:");
        int ans = 0, n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            ans += i;                       
        }
        System.out.println("1 + … + "+ n + " = " + ans);
    }
}

/*
import java.util.*;
class JPD03 {
    public static void main(String argv[]) {
        ...
        for (_______; ____________; _______) {
            ____ = ________;                       
        }
        System.out.println(__________________);
    }
}
*/