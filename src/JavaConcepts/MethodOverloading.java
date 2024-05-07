package JavaConcepts;

public class MethodOverloading {
	void add()
	{
		int a=10;
	    System.out.println(a+6);
	}
	void add(int a)
	{
		System.out.println(a+6);
		}
	
	static void add(double b, int a)
	{
		System.out.println(a+6);
		}
	void add(int a, int c, int d)
	{
		System.out.println(a+c+d);
		}
	//method overloading is create multiple methods with same name and diff parameters as above.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(3.6,10);// static method called
		MethodOverloading M= new MethodOverloading();//for not static method need to create object
		M.add();
		M.add(2);
		M.add(2, 15, 3);
			
	}
}