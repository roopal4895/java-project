package Inheritance;

public class CovariantReturn {
	
	CovariantReturn show()
	{
		
	System.out.println("show method of parent class");
	return new CovariantReturn();
	
	}

}
class Child2
{
	Child2 show()
	{
		super.show();
		System.out.println("show method of child2 class");
		return this;	
	}
public static void main(String args[]) {
	Child2 ch2=new Child2();
	ch2.show();
	
}
}
