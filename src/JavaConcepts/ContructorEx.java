package JavaConcepts;

public class ContructorEx {
	
	ContructorEx()//default constructor
	{
		int a=10;
     System.out.println(a+5+5);
			
	}
	
	ContructorEx(int r,int b,int i,int d,int f,int g,int h)//parameterized constructor
	{
		System.out.println("Constructor with seven Parameters");
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContructorEx A= new ContructorEx();//called default constructor
		ContructorEx A1 =new ContructorEx(10,11,20,30,40,50,60);//called parameterized constructor
		
		}

}
