package JavaConcepts;

public class GlobalVariableEx34 {

	String name = "Sita"; //name ,age,weight are global variables
	static int age = 20;
	double weight = 50.20;
	
	public static void main(String[] args) {
		GlobalVariableEx34 A=new GlobalVariableEx34();
		//A.add();
	    System.out.println(A.name);
        System.out.println(age);
	}
	public void add() 
	{
		System.out.println(weight);
	}
	}
	//Global variable means mentioned in class not in method. scope of thi variable is in among class.
    //to access Global variable in static method , make variable as static or create object of class and S.o.p(obj.variable)
    //we can directly access global variable in non static method, but we need to create object for non static method.
	//in method , we are trying to print "A" variable value but variable is not declared in method, 
	//then it will access and print global variable, if same variable declared in class.
	//if in method and class , same variable declared. and we want to print value of that variable in method,
	//it will print local variable value. local variable is first priority.

