package JavaConcepts;

public class EncapsulationEx {

	private String mail = "Pravin@gmail.com";
	private String un="KEsari";
	private String Pass1="Password123";
	
	public String getUn() {  //get and set for un
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	
	
	public String getPass1() {// get and set for pass
		return Pass1;
	}
	public void setPass1(String pass) {
		Pass1 = pass;
	}
	

	public String getmail()    //get and set method for mail
	{
		return mail;
	}
	public void setmail(String mail)  //Setter method-setting new value hence write string name parameter
	{
		this.mail=mail;
	}
	
	public class Encapsulation{
	public static void main(String[] args) {
		
		EncapsulationEx Ex=new EncapsulationEx();
		Ex.setmail("kesari@gmail.com");
		Ex.setPass1("Password");
		Ex.setUn("Username");
		
       System.out.println(Ex.getmail());
       System.out.println(Ex.getPass1());
       System.out.println(Ex.getUn());
	}
	}}


	
