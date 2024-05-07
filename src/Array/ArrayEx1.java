package Array;
//number is present in given array or not
public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nos[]=new int[4];
	    nos[0]=90;
	    nos[0]=50;
	    nos[0]=40;
	    nos[0]=30;
	    int givenno=41;
	    for (int i=0;i<nos.length;i++)
	    {
	    	if (givenno==nos[i])
	    	{
	    		System.out.println("Number is present in given array at position "+i);
	    	}
	    	else
	    	{
	    		System.out.println("Number is not present in given array at position "+i);
	    	}
	    }
	    
		
	}

}
//find out given number is present in array or not
