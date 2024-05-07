package Assignments;

import java.util.Arrays;

public class AssertionForLoop {

	public static void main(String[] args) {
		
		String name[]=new String[2];
	    name[0]="Ram";
	    name[1]="Sham";
	   
	    System.out.println(Arrays.toString(name));
	    for(int i=0;i<2;i++)
		   {
	    	assert name[i].length()==0: "String is Empty";
	    	System.out.println("yes");
	    	  
		   }
	}

}
