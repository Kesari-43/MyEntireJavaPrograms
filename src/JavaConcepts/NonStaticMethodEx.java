package JavaConcepts;

public class NonStaticMethodEx {
	
	static void add()//static
	{
		
		int a=10;
		int c=5;
		System.out.println(a+c);
	}

	void Sub()//non static
	{
		
		int b=10;
		int d=5;
		System.out.println(b+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStaticMethodEx n1=new NonStaticMethodEx();//syntax to create an Object 
		n1.Sub();  
		add();//called static method
		
		/*created object for non static method 
		 syntax to create an Object:Class name referenceVariable=new classname ex = kesari K = new kesari
		NonStaticMethodEx n1=new NonStaticMethodEx();
		n1.Sub(); 
		called non static method
		*/
	}
	}


