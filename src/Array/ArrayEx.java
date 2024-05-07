package Array;
//Initialization and declaration of array
public class ArrayEx {
	public static void main(String[] args) {
		String name[]=new String[4];
	    name[0]="Ram";
	    name[1]="Kesari";
	    name[2]="Sita";
	    name[3]="Pravin";
	    System.out.println(" Names: ");
	    for(int i=0;i<=3;i++)
		   {
	    	  System.out.println(name[i]);
		   }
	    
		int rollno[]=new int[3];
	    rollno[0]=7;
	    rollno[1]=17;
	    rollno[2]=70;
	    System.out.println(" Rollno: ");
	    for(int i=0;i<=2;i++) //if i<=3 then will get out of bound exception
	    {
	    	System.out.println(rollno[i]);
	    }
	    String Gender[]=new String[3];
	    Gender[0]="Male";
	    Gender[1]="Female";
	    Gender[2]="Other";
	    System.out.println(" Genders: ");
	    for(int i=0;i<3;i++)
		   {
	    	  System.out.println(Gender[i]);
		   }
	    
	}
}
