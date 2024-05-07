package Array;
//Average of two arrays: one is int and one is double 
public class AverageArrays {
	static double average =0;
	static double sum=0;
	public static void main(String[] args) {
		int number []=new int[4];
	    number[0]=10;
	    number[1]=12;
	    number[2]=0;
	    number[3]=11;
	 for(int i=0;i<number.length;i++)
	    {
	       sum=sum+number[i];
	       average = sum/number.length;   
	    }	    
	    System.out.println("Average of int array is-> "+average);
	
		double number1 []=new double[4];
	    number1[0]=100;
		number1[1]=123434;
		number1[2]=0213.4;
		number1[3]=1231;
		for(int i=0;i<number1.length;i++)
		    {
		       sum=sum+number1[i];
		       average = sum/number1.length;   
		    }	    
		   System.out.println("Average of double array is-> "+average);
	}}


