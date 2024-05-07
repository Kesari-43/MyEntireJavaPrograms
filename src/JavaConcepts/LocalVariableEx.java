package JavaConcepts;

public class LocalVariableEx {

	void add()
	{
		int a=100;//B is local variable, then its scope between the method only. if want to call local variable,
		//then need to call method in PSVM, (create object)
		System.out.println(a);//
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
			int a=10;
			int b= 20;
			System.out.println(a+b);
			
		}
      }


