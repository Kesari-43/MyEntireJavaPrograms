package Array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayWithScanner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		
				int rollno[]=new int[3];
				for(int i=0;i<3;i++)
				{
					System.out.println("Enter Arrays-> "+i);
					rollno[i]=s1.nextInt();//allow to human input
					System.out.println(Arrays.toString(rollno));
				}
	}

}
