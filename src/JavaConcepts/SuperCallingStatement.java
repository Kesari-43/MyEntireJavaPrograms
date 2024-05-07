package JavaConcepts;

class college
{
	college(String collegename)// parameterized parent class constructor
	{
		System.out.println("college");
	}
}

class school extends college
{
	school(int a, String b)//parameterized child class constructor
	{
		super("ABC college"); // super calling statement with parameter matching with Parent class constructor
		System.out.println("School");
	}
}

public class SuperCallingStatement {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		school s=new school(10, "kesari");
		
		
	}

}
