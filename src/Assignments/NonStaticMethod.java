package Assignments;
public class NonStaticMethod {
	void add() //static method
	{	int a=10;
		int b = 2;
		System.out.println(a+b);}
	void sub()
	{	float f=33;
		int s=1;
		System.out.println(f-s);}
	public void mul()
	{	float C=2;
		int D=10;
		System.out.println(C*D);}
	public void Div()
	{	float M=2;
		int N=12;
		System.out.println(M/N);}	
	void Mod()
	{	float X=13;
		int Z=2;
		System.out.println(X%Z);}
	public static void main(String[] args) {
		NonStaticMethod N1=new NonStaticMethod();	
     N1.add(); //invoked non static method , for non static method we need to creat object
     N1.sub();
     N1.mul();
     N1.Div();
     N1.Mod();
	}
		}
