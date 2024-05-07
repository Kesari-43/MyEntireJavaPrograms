package Array;

public class OverloadingMainMethod {

	public static void main(String[] args) 
	{
		System.out.println("1");
        main("Manish");//called string parameter method //called static methods with parameters value
        main(20); //calling int parameters method
        main();
	}
	public static void main()
	{
		 System.out.println("2");
	}
	
	public static void main(int a)
	{
		 System.out.println("3");
	}
    public static void main(String a)
    {
    	 System.out.println("4");
	}
}
