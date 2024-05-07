package JavaConcepts;

public class AccessSpecifiers {
	
	public void add()
	{
		System.out.println("1");
	}
	private void Sub()
	{
		System.out.println("2");
	}
	protected void Mul()
	{
		System.out.println("3");
	}
	void Div()
	{
		System.out.println("4");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifiers a=new AccessSpecifiers();
		a.add();
		a.Sub();
		a.Mul();
		a.Div();
	}

}
