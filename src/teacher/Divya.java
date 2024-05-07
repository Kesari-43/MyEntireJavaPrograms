package teacher;

import student.Kesari;

public class Divya extends Kesari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divya d=new Divya();
		d.add();
		//d.Sub(); //private method not accessible outside package
		d.Mul();
		//d.Div(); //default method not accessible outside package
		
	}

}
