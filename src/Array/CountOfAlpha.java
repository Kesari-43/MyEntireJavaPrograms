package Array;
//find out no. of Alphabets involved in given String
import java.util.Arrays;
public class CountOfAlpha {
	static int Countofalpha = 0;
	public static void main(String[] args) {
		String name = "Manish12";
		char []c1=name.toCharArray();
		System.out.println(Arrays.toString(c1)); //print string characters
		
		boolean ans=Character.isAlphabetic(c1[6]);// check index value 6 is alphabets or not, if not-print false
		System.out.println(ans);
		
		for(int i=0;i<c1.length;i++) //to check every index value is alpha or not
		{
			boolean ans1=Character.isAlphabetic(c1[i]);
			System.out.print(ans1+ " ");
			
		if (ans1== true) // if there is alpha the print count of alphabets
		{
			Countofalpha++;
			System.out.println("- Alphabet involved " +Countofalpha);
		}
		else
		{
			System.out.println("- No Alphabet involved");
		}
		}
	}
}
		
		
		






