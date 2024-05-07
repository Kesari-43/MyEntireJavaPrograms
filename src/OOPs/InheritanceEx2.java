package OOPs;
// Multilevel Inheritance
public class InheritanceEx2 {
	void add()
	{
		System.out.println("Addition...");
	} 
}
 class Inheritance3 extends InheritanceEx2
 {
	 void sub()
		{
			System.out.println("Substraction...");
		} 
	}
 class Inheritance4 extends Inheritance3
 {
	 void mul()
		{
			System.out.println("Multiplication...");
		}

	public static void main(String[] args) 
	{
		Inheritance4 I4=new Inheritance4();
		I4.add();
		I4.sub();
		I4.mul();
	}

}
