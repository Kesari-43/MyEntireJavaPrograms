package Assignments;

import java.util.Scanner;

public class ScannerClass {
	static void add()
	{
	  System.out.println("Addition ");
	}
    static void sub()
	{
	   System.out.println("Substraction ");
	}
	
    static void mul()
	{
		System.out.println("Multiplication ");
	}	 
    static void div() 
	{
		System.out.println("Division ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("all static methods from scanner class: ");
		int a=S.nextInt();
		add();
		int a1=S.nextInt();
		sub();
		int a2=S.nextInt();
		mul();
		int a3=S.nextInt();
		div();
			}
		}