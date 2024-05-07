package JavaConcepts;
//converting data type in to another data types
public class TypeCastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long age =1000;
		
		byte age1 = (byte)age;
		System.out.println("Converted long data type into byte: "+age1);
		
		//Converting int into float
		int number = 25;
		float number1= number;
		System.out.println("Converted int data type into float: "+number1); 
	}

}
