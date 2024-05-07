package Array;
//find average value of array
public class AverageValueOfArray {
static double average =0;
static int sum=0;
static int reminder=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number []=new int[4];
    number[0]=10;
    number[1]=12;
    number[2]=0;
    number[3]=11;
    
    for(int i=0;i<number.length;i++)
    {
    	sum=sum+number[i];
    	average = sum/number.length;   
    	reminder=sum%(number.length);
    }
    System.out.println("Sum is-> "+sum);
	System.out.println("Average is-> "+average);
	System.out.println("reminder is-> "+reminder);
   
	}

}

