package JavaConcepts;

public class NestedIf_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		  int c=20;
		  
		   if(a>20) //10>20 Greater than condition is false, so will not execute,ignore by java
		   {
			   System.out.println("Hello");//
		   
		   			if(a>=20) //10<20 lesser than condition is true
				  
		   			{
		   				System.out.println("a is lesser than 20");
		   			}
		   			else {
		   				System.out.println("20");
		   			}
		   	}
		   else
		   {
			   System.out.println("30");
		   }
		   
	}
}

