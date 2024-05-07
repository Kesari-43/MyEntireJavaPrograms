package Assignments;
public class StaticMethodProgram {
	static void add() //static method
	{	int a=10;
		int b = 20;
		System.out.println(a+b);}
	static void sub()
	{	float f=33;
		int s=10;
		System.out.println(f-s);}
	static void mul()
	{	float C=3;
		int D=10;
		System.out.println(C*D);}
	static void Div()
	{	float M=2;
		int N=10;
		System.out.println(M/N);}	
	static void Mod()
	{	float X=10;
		int Z=2;
		System.out.println(X%Z);}
	
	public static void main(String[] args) {
     add(); //invoked static method , static method we can call directly without creating object
     sub();
     mul();
     Div();
     Mod();
	}
}
