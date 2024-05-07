package OOPs;
//final class- inheritance concept
class Inherit 
{
    final void add() 
    {
        System.out.println("final method.");
    }
}

final class Div extends Inherit
{
    void sub()
    { 
          System.out.println("Non static method");
    }
}
public class InheritanceEx4 {
	public static void main(String[] args) {
		Div obj=new Div();
          obj.sub();
          obj.add();
	}

}
