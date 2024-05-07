package JavaConcepts;
import java.util.Scanner;
public class ScannerClass {
	public static void main(String[] args) {
		Scanner S1=new Scanner(System.in); //declare scanner class
		int a=S1.nextInt(); //NextInt will accept only int value
		System.out.println(a);
		
		String a2=S1.next();
		System.out.println(a2+10);
		
		Float a3=S1.nextFloat();
		System.out.println(a3-1);
		
		Double D =S1.nextDouble();
		System.out.println(D+1);
		
		Short S=S1.nextShort();
		System.out.println(S+a2);
		
		Long L=S1.nextLong();
		System.out.println(L);
		
		Boolean B=S1.nextBoolean();
		System.out.println(B);
		
		Byte B2=S1.nextByte();
		System.out.println(B2);
		
		S1.close(); //will stop accepting human inputs at run time.
	}

}
