package JavaConcepts;
//Even/ odd numbers
public class FOR_loopEx2 {
public static void main(String[] args) {
		/*	for(int i=1;i<=20;i++)
		{
			System.out.println(i);
			i++; //print odd numbers
		}*/
		/*	for(int i=2;i<=20;i++)
		{
			System.out.println(i);
			i++; //print even numbers
		}*/
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
			System.out.println(i+ " is Even number");
			}
			else {
				System.out.println(i+ " is Odd number");
			}
		}
	}
	}
