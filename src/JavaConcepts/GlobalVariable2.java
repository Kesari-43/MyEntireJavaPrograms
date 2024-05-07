package JavaConcepts;

public class GlobalVariable2 {
	
	 String name="Kesari";// name is gobal variable
	 static int rollnumber = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlobalVariable2 G=new GlobalVariable2();
		//to call global variable in main method(static method), make variable as a static or create object and call in S.o.p(object.variable)
       System.out.println(G.name);
       System.out.println(rollnumber); //variable is static so without object we can print

	}

}
