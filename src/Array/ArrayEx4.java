package Array;
//find out value present in array or not
import java.util.Arrays;
public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number []=new int[4];
	    number[0]=10;
	    number[1]=12;
	    number[2]=0;
	    number[3]=11;
	    
	    System.out.println(Arrays.toString(number)); //this ill convert array in form of [10, 12, 0, 11]
	    int Givenno=11;
	    
	    for(int i=0;i<number.length;i++)
	    {
	    	if (Givenno==number[i])
	    	{
	    		System.out.println("Number is present in given array");
	    	}
	    	else
	    	{
	    		System.out.println("Number is not present in given array");
	    	}
	    	
	    }
	    
	    
	    
	}

}
