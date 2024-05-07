package Assignments;
//to check two strings are equal or not
public class StringsEx123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Kesari";
		String name1 = "Kesari";
		System.out.println("String 1: "+name);
		System.out.println("String 2: "+name1);
		
		if(name.equals(name1)==true)     // to check two Strings are equal or not
		{
	    	System.out.println("2 Strings are equal");
	    }
	    else
	    {
	    	System.out.println("sorry! 2 Strings are not equal");
	    }
		
		String name3 = "Patil";
		String name4 = "Divya";
		System.out.println("String 3: "+name3);
		System.out.println("String 4: "+name4);
		
		if(name3.equals(name4)==true)     // to check two Strings are equal or not
		{
	    	System.out.println("2 Strings are equal");
	    }
	    else
	    {
	    	System.out.println("sorry! 2 Strings are not equal");
	    }
	}

}
