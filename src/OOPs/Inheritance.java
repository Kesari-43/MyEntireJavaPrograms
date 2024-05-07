package OOPs;
//Single inheritance
public class Inheritance {
	
	void add()
	{
		System.out.println("Addition...");
	} 
}
	class Inheritance1 extends Inheritance //inherits parent class
	{  
		void sub()
		{
			System.out.println("Substraction...");
		}  
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance1 T=new Inheritance1();
			T.add();  
			T.sub();  
			} 
	}
