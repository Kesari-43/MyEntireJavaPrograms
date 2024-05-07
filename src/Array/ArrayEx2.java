package Array;
import java.util.Arrays;
//copy value of one array into another array
public class ArrayEx2 {
     public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]=new String[4];
	    name[0]="Ram";
	    name[1]="Kesari";
	    name[2]="Sita";
	    name[3]="Pravin";
	   
	   
	   String[] namecopy=new String[name.length];
	   System.out.println(Arrays.toString(name));
	  for(int i=0;i<name.length;i++)
	   {
		   namecopy[i]=name[i];
	   }
	  System.out.println(Arrays.toString(namecopy));
	   
	   
           	}

	}




