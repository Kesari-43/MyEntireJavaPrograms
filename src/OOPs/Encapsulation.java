package OOPs;

public class Encapsulation {
	private int age=18;
   
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
	
		Encapsulation e = new Encapsulation();
		        e.setAge(10); 
		        System.out.println("age: " + e.getAge());
		       
		    }
		}
