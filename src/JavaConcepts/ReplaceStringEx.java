package JavaConcepts;
//how to remove any char from string
//how to replace any char form string with another char
//replace all string

public class ReplaceStringEx {

	public static void main(String[] args) {
		// remove char "o" from string
		String input="School123";
		String output=input.replace('o', ' '); 
		System.out.println(output); 
	
		//how to replace char "o" form string with another char "M"
		String input1="School123";
		String output1=input1.replace('o', 'M');
		System.out.println(output1);
		
		//remove small letters from string
		String input2="School123";
		String output2=input2.replaceAll("[a-z]", " ");
		System.out.println(output2);
		
		//remove capital letters from string
		String input3="School123";
		String output3=input3.replaceAll("[A-Z]", " ");
		System.out.println(output3);
		
		//remove all numeric values from string
		//only work in 17 windows
		
	}

}
