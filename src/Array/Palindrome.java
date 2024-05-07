package Array;
//Array string is palindrome or not
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "MOM";
		String reverse = "";
		for (int i= input.length()-1;i>=0;i--)
		{
			char a=input.charAt(i); //print characters of string
			System.out.println(a);
		}
		
		 reverse=reverse+input; //reverse =
		 System.out.println(reverse); // print reverse of string
		 if(input.equals(reverse)) //check if its Palindrome or not
		 {
			 System.out.println("its Palindrome");
		 }
		 else
		 {
			 System.out.println("its not Palindrome");
		 }
	  }
	

}
