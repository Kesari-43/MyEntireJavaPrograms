package JavaConcepts;

public class StaticMethodExample {
	
	static void add() //static method
	{
		int a=10;
		int b= 15;
		System.out.println(a+b);
	}
	
	void sub()//non static method
	{
		double f=3.2;
		int s=10;
		System.out.println(f+s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               add(); //static
               StaticMethodExample Ex=new StaticMethodExample();//non static
               Ex.sub();
       	}

}


//static method mentioned out of the main method 
//called static method into main method
