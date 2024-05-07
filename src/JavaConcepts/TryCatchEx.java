package JavaConcepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx {

	public static void main(String[] args) {
		
    Scanner S1=new Scanner(System.in);
    
     try{
       int age= S1.nextInt();
       System.out.println(age);  //if enter string value in output, will get InputMismatchException. and 1st catch will execute
       
       String name[]=new String[3];// if array size=3 will get outof bound exception-> catch2 will execute
       name[0]="Ram";
       name[1]="Sita";
       name[2]="Lakshman";
       name[3]="Hanuman";
       
       System.out.println("names-");
       for(int i=0;i<=3;i++)
	   {
    	  System.out.println(name[i]);
	   }
           }
    
    catch(InputMismatchException a1)
    {
    	System.out.println("Exception 1");
    	
    }
     catch(ArrayIndexOutOfBoundsException a2)
     {
     	System.out.println("Exception 2");
     	
     }
     
	}}
    	

	
