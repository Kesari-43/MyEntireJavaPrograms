package JavaConcepts;
//upcasting
class parent1
{
	void add()
	{
	System.out.println("Object class");
	}
}
public class AutomationBatch41 extends parent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent1 p1=new AutomationBatch41();
		p1.add();
		
	}
}
