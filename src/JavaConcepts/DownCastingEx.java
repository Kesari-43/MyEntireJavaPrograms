package JavaConcepts;
class Parent {   
       
    void add()   
    {   
        System.out.println("Parent method");   
    }   
}    
class Child extends Parent {   
       
     void sub()
     {
    	 System.out.println("Child method");
     }
}     
public class DownCastingEx {

	public static void main(String[] args) {
		Parent p = new Child();  
        p.add();  
                  
        Child c = (Child)p;    // Downcasting
        c.sub();   
    }   
}  
	
