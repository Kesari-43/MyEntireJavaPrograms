package JavaConcepts;

public class IfconditionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a=10;
  int c=20;
  
   if(a>20) //10>20 Greater than condition is false, so will not execute,ignore by java
   {
	   System.out.println("Hello");
   }
   if(a<20) //10<20 lesser than condition is true
	  
   {
	   System.out.println("a is lesser than 20");
   }
   if(a>=10) //greter than equal to  condition is true
   {
	   System.out.println("a is greater than equal to 10");
   }
   if(a!=20) 
   {
	   System.out.println("a is not equal to 20");
   }
   if(c==20)
   {
	   System.out.println("C is equal to 20");
   }
	}

}
