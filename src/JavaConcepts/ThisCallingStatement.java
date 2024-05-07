package JavaConcepts;

public class ThisCallingStatement {
	
	ThisCallingStatement()//parent class constructor
	{   
		this(22); //this will print 2nd constructor
		System.out.println("1");
	}
	
	ThisCallingStatement(int a)//2nd parent class contructor with diff para
	{
		this(2.3);//this calling statement with matching parameters value of 3rd constructor
		System.out.println("2");
	}
	
	ThisCallingStatement(double b)// 3rd parent class constructor with diff para
	{
		System.out.println("3");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisCallingStatement T= new ThisCallingStatement();// called non parameterized constructor hence first print this constructor
	}

}
