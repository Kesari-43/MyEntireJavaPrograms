package JavaConcepts;
//current, past,future date
import java.util.Date;
public class DateClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date(); //redefined class
		System.out.println(d1);//print todays date
		
		String input= d1.toString();//convert date into string
		System.out.println("Date: "+input);
		
		String month= input.substring(4, 7); //print month
		System.out.println("Month: " +month);
		
		String Date= input.substring(8, 10); //print date
		System.out.println("Date: " +Date);
		
		System.out.println("Length of date: " +input.length()); //length
		
		String year=input.substring(24); //here 24 is index no. from date to print year
		System.out.println("Year: "+year);
		
		System.out.println(Date.concat(" ").concat(month).concat(" ").concat(year)); //date format print
		System.out.println(Date.concat("-").concat(month).concat("-").concat(year));//date format
		System.out.println(Date.concat("/").concat(month).concat("/").concat(year));//date format
		
		System.out.println(d1.getTime()); //get time
		
		Date d2=new Date(d1.getTime()+(60*60*1000*24*1)); // to print future date
		System.out.println("Future date: "+d2);
		
		Date d3=new Date(d1.getTime()-(60*60*1000*24*2)); // to print Past date
		System.out.println("Past date: "+d3);
	}
}
/* 
 here 1000 mili second
 60 minutes
 60 hourse
 24 hourse
 1 day */
 
