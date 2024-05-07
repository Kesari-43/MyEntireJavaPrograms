package Assignments;
//Local variables
public class LocalVariablesEx {
	void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	void Sub()
	{
		int a=10;
		int b=2;
		System.out.println(a-b);
	}
	void Mul()
	{
		int a=1;
		int b=2;
		System.out.println(a*b);
	}
	void Mod()
	{
		int a=1;
		int b=20;
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		LocalVariablesEx Ex=new LocalVariablesEx();
		Ex.add();
		Ex.Sub();
		Ex.Mul();
		Ex.Mod();
	}
}
