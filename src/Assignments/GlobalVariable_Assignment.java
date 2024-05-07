package Assignments;
public class GlobalVariable_Assignment{
	int A = 10; 
	int B = 20;
 void add()
	{
		System.out.println(A+B);
	}
 void Sub()
	{
		System.out.println(A-B);
	}
	
 void Mul()
	{
		System.out.println(A*B);
	}
	
 void Mod()
	{
		System.out.println(A%B);
	}
 public static void main(String[] args) {
		GlobalVariable_Assignment G1=new GlobalVariable_Assignment();
 		G1.add();
		G1.Sub();
	    G1.Mul();
	    G1.Mod();
	}
}
