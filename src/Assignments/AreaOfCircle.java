package Assignments;

public class AreaOfCircle {

	final static double pi = 3.14;                                      //final variable
	static int radius = 5;
	static double area;
	static double Circumference;
	
	public static void main(String[] args) {
		area = pi * radius * radius;                                    // calculating the area of the circle
		Circumference = 2*pi*radius;                                    // calculating the Circumference of the circle
		 		
        System.out.println("Area of circle is " + area);
        System.out.println("Circumference of circle is " + Circumference);
     }
}
