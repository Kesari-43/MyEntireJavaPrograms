package Assignments;
public class ConstructorOverloading {

ConstructorOverloading()                                                        //default constructor
	{
	int a=10;
    System.out.println(a+5+5);
	}
	
ConstructorOverloading(int r,int b,int i,int d,int f,int g,int h)               //parameterized constructor
	{
	System.out.println("Constructor with seven Parameters");
	System.out.println(r+b+i+d+f+g+h);
			
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ConstructorOverloading A= new ConstructorOverloading();                     //called default constructor
	ConstructorOverloading A1 =new ConstructorOverloading(10,11,20,30,40,50,10);//called parameterized constructor
		
		}
	}
