
public class MethodOverriding {
	
	public void show()
	{
	
		System.out.println("show method of parent class");
		
	}
}
class Child extends MethodOverriding
{
public static void main(String[] args) {

	Child ch =new Child();
	ch.show(); //run child method-goes reference to child method
}	

void show()
{
super.show();
System.out.println("show method of child class");	

}
}