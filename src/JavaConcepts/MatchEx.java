package JavaConcepts;
//Matches function
public class MatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Manish";
		input.matches(input);
		
		System.out.println(input.matches("M(.*)"));//check name start with letter "M"
		
		System.out.println(input.matches("(.*)h"));//check name Ends with  Letter "h"
		
		System.out.println(input.matches("....."));//check string contain 5 letter
		
		String input1="School";
		int a2= input1.lastIndexOf('l'); //check index no.
		System.out.println(a2);
		
		System.out.println(input1.repeat(10)); //repeat string multiple times
		}
	}
		


	
	
	


	
	