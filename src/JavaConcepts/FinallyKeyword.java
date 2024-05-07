package JavaConcepts;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FinallyKeyword {
	
	public static void main(String[] args) {
		
		Scanner S1=new Scanner(System.in);
	      try
	     {
	      int age= S1.nextInt(); //if input will be wrong, then catch block will execute
	      System.out.println(age);
	     } 
	     
	     catch(InputMismatchException a1)
	     {
	    	 System.out.println("catch block: Input mismatch");
	     }
	     
	     finally //finally block will always execute
	     {
	    	 System.out.println("Finally block ");
	     }
	}
}
