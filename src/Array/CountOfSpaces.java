package Array;
//find out no. of Spaces involved in given String
import java.util.Arrays;
public class CountOfSpaces {
	static int CountofSpaces = 0;
	public static void main(String[] args) {
		String name = "Manish Kumar Tiwari";
		char []c1=name.toCharArray();
		System.out.println(Arrays.toString(c1)); //print string characters
		
		for(int i=0;i<c1.length;i++)
		{
		boolean ans=Character.isSpaceChar(c1[i]);// to check every index value is space or not, if not-print false
		System.out.println(ans);
		
		if(ans==true)
		{
			CountofSpaces++;
			System.out.println("Count of Spaces "+CountofSpaces);
		}
		}
		}
	}


