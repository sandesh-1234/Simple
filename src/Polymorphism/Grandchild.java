package Polymorphism;

public class Grandchild extends Subchild
 {
	public void test()
	{
		System.out.println("Overrided in Grand Child");
	}
	public void test3()
	{
		super.test();
	
	}
	public static void main(String[] kk)
	{
		Grandchild obj=new Grandchild();
		obj.test();
		obj.test3();
		obj.test2();
		Parent.test1();
	}
	

}
