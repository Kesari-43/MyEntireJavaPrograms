package JavaConcepts;
// widening implcite and explicite
public class WideningEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age= 20;
		
		double age1 = age; //implicite widening
		System.out.println(age1);
		
		double age2 = (double)age; //Explicite Widening
		System.out.println(age2);
	}

}
