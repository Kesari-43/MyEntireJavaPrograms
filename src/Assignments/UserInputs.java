package Assignments;

import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) 
	{
	     char operator;
		Scanner s = new Scanner(System.in );
			System.out.print("Enter A : ");
			int a = s.nextInt();
			System.out.print("Enter B : ");
			int b = s.nextInt();
			System.out.print("Enter operator (+, -, *, /)");
			operator = s.next().charAt(0);
			double addition  = a+b;
			System.out.print("Addition is : "+addition);
			 
		
			System.out.print("Enter A : ");  //String addition1 = s.nextLine(); 
			int c = s.nextInt();
			System.out.print("Enter B : ");
			int d = s.nextInt();
			System.out.print("Enter operator (+, -, *, /)");
			operator = s.next().charAt(0);
			double substraction  = a-b;
			System.out.print("Substraction is : "+substraction);
			//double subtraction  = a-b;
			//double multiplication  = a*b;
			//double division  = a/b;
        
	/*switch(operator)
        {
            case '+' :
            {
                System.out.print("Addition is : "+addition);
                break;
            }
            case '-' :
            {
                System.out.print("Subtraction is : " +subtraction);
                break;
            }
            case '*' :
            {
                System.out.print("Multiplication is : "+multiplication);
                break;
            }
            case '/' :
            {
                System.out.print("Division is : "+division);
                break;
            }
            default :
            {
                System.out.print("Please select proper operator");
                return;
            }*/
        }
	}

	//use s.o.p after every double addition  = a+b; operations or use switch case.