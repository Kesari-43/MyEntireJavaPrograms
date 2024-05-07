package JavaConcepts;

public class ThisKeyword {
 int age;
 String name;
 double salary;
 
	void student_details(int age,String name, double salary) //non static method
	{
		//System.out.println("age"+age+"name"+name+"salary"+salary);
		this.age=age;
		this.name=name;
		//this.salary=salary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword T=new ThisKeyword();
		T.student_details(10,"Kesari",200.2);//called method
		System.out.println(T.age);
		System.out.println(T.name);
		System.out.println(T.salary); //will print default value of data types
		
		
	}
	}
