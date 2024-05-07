package Array;
//Assertion with Array
import java.util.Arrays;

public class ArrayWithAssertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[]=new String[4];
	    name[0]="Ram";
	    name[1]="Kesari";
	    name[2]="Sita";
	    
		System.out.println(Arrays.toString(name));
	    assert name[1].length()==2 : "Length of String is 2";
	    System.out.println("invalid data");
			  }
	
	}


