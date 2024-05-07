package JavaConcepts;

public class PassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PassingParameter P=new PassingParameter();
		P.add(23,40); //create object and pass parameters
		int result =P.sub(2,4); //if return value then call method like this.
		System.out.println("Result is: "+result);
	}
     public void add(int a, int b)//passing parameter
     {
    	 int c= a+b; 
    	 System.out.println("Result is: "+c);
     }
     
     public int sub(int Z,int d)
     
     {
    	 int result = Z-d;
    	 return result; //if we return value here , then it will take result from main method
    	 
     }
}
