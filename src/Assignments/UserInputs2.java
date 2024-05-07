package Assignments;

import java.util.Scanner;

public class UserInputs2 {

	public static void main(String args[])
    {
        Scanner s = new Scanner(System.in );
        int a, b;
        char operator;
        System.out.print("Enter A : ");
        a=s.nextInt();
        System.out.print("Enter B : ");
        b=s.nextInt();
        System.out.print("Enter operator (+, -, *, /)");
        operator = s.next().charAt(0);
        double addition  = a+b;
        double subtraction  = a-b;
        double multiplication  = a*b;
        double division  = a/b;

        switch(operator)
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
            }
        }
    }
}

