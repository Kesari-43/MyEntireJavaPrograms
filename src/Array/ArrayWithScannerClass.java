package Array;
import java.util.Arrays;
// array with scanner class
import java.util.Scanner;

public class ArrayWithScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S1=new Scanner(System.in);
		String Student[]=new String[2];
Student[0]="Ram";
	Student[1]="Kesari";
	   		
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter Arrays-> "+i);
			Student[i]=S1.next();//allow to human input
			System.out.println(Student[i]);
			
		}
	}

}
