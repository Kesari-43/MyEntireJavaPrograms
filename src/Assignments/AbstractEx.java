package Assignments;
public class AbstractEx {
	public void add()	//concrete method
	{
		System.out.println("Concrete1");
	}
	public void sub()	//concrete method
	{
		System.out.println("Concrete2");
	}}
abstract class abstract1 extends AbstractEx{
		abstract void mul(); //abstract method
		abstract void div();//abstract method
	}
class abstract2 extends abstract1{
	void login() //concrete method
	{
		System.out.println("Concrete3"); 
	}
	void logout()//concrete method
	{
			System.out.println("Concrete4"); 
	}
	
public static void main(String[] args) {
	abstract2 a=new abstract2();
    a.add();
	a.sub();
	a.login();
	a.logout();	
	a.mul();
	a.div();
}
@Override
void mul() {
	// TODO Auto-generated method stub
	System.out.println("Concrete5");
}
@Override
void div() {
	// TODO Auto-generated method stub
	System.out.println("Concrete6");
}
}
	
