package Polymorphism;

public class Sub extends Incomplete
{
	public void test2()
	{
		System.out.println("Method has completed here");
	}
	public static void main(String[] args) 
	{ 
		Sub obj=new Sub();
		obj.test2();
		obj.test();
		
		
	}

}
