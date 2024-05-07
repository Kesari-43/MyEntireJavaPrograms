package Array;
//find out no. of Numbers involved in given String
import java.util.Arrays;
public class CountOfNumerics {
	static int CountofNumeric = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Manish12";
		char []c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));      //print string characters
		
		for(int i=0;i<c1.length;i++)
		{
		boolean ans=Character.isDigit(c1[i]);        // to check every index value is numeric or not, if not-print false
		System.out.println(ans);
		
		if(ans==true)                                //if there is numbers print count of number value
		{
			CountofNumeric++;
			System.out.println("Count of Numeric "+CountofNumeric);
		}
		}
	}}


