package OOPs;

public class SuperKeyword {
	final void add()
    {
   	 System.out.println("Addition");
    }  
}  
class Override12 extends MethodOverrding
{  
      void add()                                            // same method created as parent class
 		{
	      System.out.println("Substraction");
	      super.add();
	      
	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Override12 Obj1=new Override12();
		Obj1.add();
	}

}




//super keyword used to gather parent class implementation into child class. 
//here parent class method will not override due to super keyword.
//final method can not be override