package Polymorphism;

public class Subchild extends Parent
 {
	int a=70;
	public void demo()
	{
		System.out.println("Child Property");
	}
	public void test() //Overriding method of Parent class.
	{
		System.out.println("This is Overriding");
	}
	public static void test1()
	{
		System.out.println("Hello");
	}
	
	public void test2()
	{
		super.test();// will call test method of parent class
		System.out.println(super.a);// will call parent property
		System.out.println(this.a);//70

	}
}
