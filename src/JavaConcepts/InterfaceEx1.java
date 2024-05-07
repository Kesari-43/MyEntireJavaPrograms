package JavaConcepts;
//interface with 2AM, extends by interface(1AM), implement by concrete class
public interface InterfaceEx1 { //interface
	void add();// abstract method
	void Sub();// abstract method
interface interfaceEx3 extends InterfaceEx1 //interface
	{
		void div(); // abstract method
	}
class class1 implements interfaceEx3{ //concrete class
			public static void main(String[] args) {
			class1 a=new class1(); //create object of child class
			a.Mul();
			a.add();
			a.Sub();
			a.div();
		}
		//implemented abstract methods
		void Mul()
		{
			System.out.println("Concrete method");
		}
		@Override
		public void add() {
			// TODO Auto-generated method stub
			System.out.println("Implemented abstract method: Add");
		}
		@Override
		public void Sub() {
			// TODO Auto-generated method stub
			System.out.println("Implimented abstract method: Sub");
		}
		@Override
		public void div() {
			// TODO Auto-generated method stub
			System.out.println("Implimented abstract method: Div");
		}
	}
}
