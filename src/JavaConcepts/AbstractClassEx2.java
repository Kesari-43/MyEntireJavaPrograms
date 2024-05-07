package JavaConcepts;

public class AbstractClassEx2 {
	void get() //concrete method
	 {
		 System.out.println("Concrete method");
	 } 
}
  abstract class run extends AbstractClassEx2
	{
		abstract void add1(); 
	}
 
  abstract class abstract1 extends AbstractClassEx2
	{
	     abstract void add1();
	     
	
class abstract2 extends abstract1 {
	void add1() {
		// TODO Auto-generated method stub
		System.out.println("Abstract class1");
	}}
	
class abstract4 extends run{

		@Override
		void add1() {
			// TODO Auto-generated method stub
			System.out.println("Abstract class2");
		}
		
	public static void main(String[] args) {
			
			AbstractClassEx2 Ex=new AbstractClassEx2();
			Ex.get();
			
			
	}
					
}	}

	

