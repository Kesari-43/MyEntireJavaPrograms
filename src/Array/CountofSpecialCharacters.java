package Array;

public class CountofSpecialCharacters {
	static int countofSpecialChar = 0;
	public static void main(String[] args) {
	String name  = "Manish!@#";
    for (int i=0;i<name.length();i++) 
    {
      if(!Character.isDigit(name.charAt(i)) && !Character.isLetter(name.charAt(i)) && !Character.isWhitespace(name.charAt(i))) 
           {
              countofSpecialChar++;
           }
   }
     if (countofSpecialChar == 0)
       {
           System.out.println("No Special Characters involved.");
       }
     else 
     {
           System.out.println(countofSpecialChar +" " +"Special Characters involved "); 
     }
   }
}


