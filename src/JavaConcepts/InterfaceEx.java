package JavaConcepts;

public interface InterfaceEx {
	
	void login();  //abstract method
	void logout(); //abstract method

      }
 class interfaceEx2 implements InterfaceEx
     {
	public static void main(String[] args) {
		interfaceEx2 Ex=new interfaceEx2();
		Ex.login();
		Ex.logout();
	}
	
	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login");
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Logout");
	}
	
}