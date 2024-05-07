package JavaConcepts;

abstract class AbstractClass { //abstract class
	
	 abstract void add(); //abstract method
	   
}
 class amazon extends AbstractClass
   {
	void login()
	{
		System.out.println("Login");
	}

	public static void main(String[] args) {
		amazon a= new amazon();
		a.login();
		a.add();
		}
   
	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println("unimplemented");
	}

}
