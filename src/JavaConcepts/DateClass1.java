package JavaConcepts;
import java.util.Date;
public class DateClass1 {
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
		
		String year=input.substring(24); //here 24 is index no. from date to print year
		System.out.println("Year: "+year);
		 
		System.out.println(Date.concat(" ").concat(month).concat(" ").concat(year)); //date format print
		System.out.println(Date.concat("-").concat(month).concat("-").concat(year));//date format
		System.out.println(Date.concat("/").concat(month).concat("/").concat(year));//date format
			}
}
