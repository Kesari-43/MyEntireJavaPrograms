package OOPs;
//hierarchical  LEVEL INHERITANCE using static methods
class A {
    static void add()
    {
    	System.out.println("hi");
    }
}
class B extends A {
   static void Sub() {
       System.out.println("Message1");
   }
}
class C extends A {
    static void Mul() {
        System.out.println("Message2");
    }
}
public class InheritanceEx3 {
    public static void main(String args[]) {
       B.Sub();
       C.Mul();
       A.add();
    }

										
}
				
			
		

