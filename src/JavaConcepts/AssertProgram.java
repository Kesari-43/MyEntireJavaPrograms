package JavaConcepts;

public class AssertProgram {
	
	void add(int a, int b)
	{
		assert a==100:" statement is wrong"; //condition
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssertProgram A=new AssertProgram();
		A.add(10, 10);
		
       String name="";
        assert name.length()>0: "The Length of string is 0 "; //condition
        System.out.println(" Jatin");
		
	}

}


//in assertion if condition met expectation then get output, else we will get assertionError
//to activate Assert in eclips , go to run config and type -ea arguments-> VM arguments