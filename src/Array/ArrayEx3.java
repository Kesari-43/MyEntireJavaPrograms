package Array;
//check two arrays are equal or not
import java.util.Arrays;
public class ArrayEx3 {
	public static void main(String[] args) {

		int Empid[]=new int[3]; //Array 1
		Empid[0]=1;
		Empid[1]=2;
		Empid[2]=3;
	    System.out.println(" EmpId: ");
	    for(int i=0;i<3;i++)
		   {
	    	  System.out.println(Empid[i]);
		   }
	    
		int rollno[]=new int[3]; //Array 2
	    rollno[0]=7;
	    rollno[1]=17;
	    rollno[2]=70;
	    System.out.println(" Rollno: ");
	    for(int i=0;i<=2;i++) //if i<=3 then will get out of bound exception
	    {
	    	System.out.println(rollno[i]);
	    }
	    
	    if(Arrays.equals(Empid, rollno)==true)// to check two arrays are equal or not
		{
	    	System.out.println("2 arrays are equal");
	    }
	    else
	    {
	    	System.out.println("sorry! 2 arrays are not equal");
	    }
	} 

	}
