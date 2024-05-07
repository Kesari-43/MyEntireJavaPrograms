package OOPs;
//Java Method Overriding  
public class MethodOverrding {

	void add()
	     {
	    	 System.out.println("Addition");
	     }  
	 }  
	class Override1 extends MethodOverrding
	{  
	                                                 //defining the same method as in the parent class  
		
	  void add()                                     // same method created as parent class
	  		{
		      System.out.println("Substraction");
		    }  
	  
	  public static void main(String args[]){  
		  Override1 obj = new Override1();                        //creating object  
	       obj.add();                                              //calling method  
	  }  
	}  

	
	
	
	
	
	
	//create two methods with same name and same parameters but different implementation.
	//parent class method will be override and print child class method