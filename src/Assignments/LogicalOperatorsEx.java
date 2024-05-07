package Assignments;

public class LogicalOperatorsEx {

	public static void main(String[] args) {
		  // initializing variables
		        int a = 10; 
		        int b = 20;
		        int c = 30; 
		        int d = 2;
		 
		       if (!(a < b) && (b == c))  // using logical AND with NOT 
		        {
		            System.out.println("True Conditions");
		        }
		        else 
		        {
		        	System.out.println("Both conditons are false");
		        }
		        
		        if(!(a > b) || (c == d)) //using logical OR with NOT 
		        {
		          System.out.println("False conditions");
		        }
	 
	            else
                {
                    System.out.println("Both conditions are false");
                }
	}
}

