package Level001;
public class JPA109 
{ 
    public static int adder (int skill, int action, int excitment) { 
        return skill + action + excitment;                                    
    } 
   
    public static int gameRating (int s, int a, int e) { 
        return adder(s, a, e);                                      
    } 
  
    public static void main (String argv[]) { 
        int skill = 6, action = 9, excitment = 8, result; 
        result = gameRating(skill, action, excitment); 
        System.out.print("The rating of the game is "); 
        System.out.println(result);                        
    } 
} 

/*
public class JPD01 { 

	public static int adder (__________________) { 
	    return _______________;                                    
	} 
	
	public static int gameRating (int s, int a, int e) { 
	    return adder(__________________);                                      
	} 
	
	public static void main (String argv[]) { 
	    int skill = 6, action = 9, excitment = 8, result; 
	    result = gameRating(skill, action, excitment); 
	    System.out.print("The rating of the game is "); 
	    System.out.println(result);                        
	} 
} 
*/