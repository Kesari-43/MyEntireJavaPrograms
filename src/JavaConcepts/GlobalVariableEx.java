package JavaConcepts;

public class GlobalVariableEx {

	String name = "Sita"; //name ,age,weight are global variables
	int age = 20;
	double weight = 50.20;
	
	
	void add(String name, int age, double weight)
	{
		System.out.println("Data is " +name  +age  +weight);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlobalVariableEx G1=new GlobalVariableEx();
		System.out.println(G1.name); // will print global variable value"Sita"
		System.out.println(G1.age);
		G1.add("Ram", 30, 20.2);
		//add method called in main method hence values in add method will be displayed
		
		
		
	}

}
