package Array;
//find out if given 2 strings anagram to each other
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String input="Beard";
 String input1="Bread";
 
 char c1[]=input.toCharArray(); //display char from string
 char c2[]=input.toCharArray();
 
 System.out.println("Before sorting->");
 System.out.println(Arrays.toString(c1));
 System.out.println(Arrays.toString(c2));
 
 Arrays.sort(c1); //sort char from string
 Arrays.sort(c2);
 System.out.println("after sorting->");
 System.out.println(Arrays.toString(c1)); 
 System.out.println(Arrays.toString(c2));
	
  if(Arrays.equals(c1, c2)==true)
    {
	System.out.println("They are Anagram");
    }
    else
    {
    	System.out.println("They are not Anagram");
    }
	}}
