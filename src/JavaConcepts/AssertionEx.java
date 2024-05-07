package JavaConcepts;

public class AssertionEx {
	
	void add()
	{
		String name ="";  //condition
		assert name.length()>0: "The Length of string is 0"; //condition
		System.out.println("Empty String");
		}

	public static void main(String[] args) {
		
		AssertionEx a= new AssertionEx();
        a.add();
		
	}
}