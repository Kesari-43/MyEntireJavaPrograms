package JavaConcepts;

public class FinalKeywordEx {
	
	
	final static double pi=3.14; //global variable
	
	void add()
	{
		final int a=10; //local variable
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		System.out.println(pi);
		FinalKeywordEx obj=new FinalKeywordEx();
		obj.add();
		
		
	}

}
