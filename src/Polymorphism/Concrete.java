package Polymorphism;

public class Concrete extends Sub
 {
	public void demo()
	{
		System.out.println("Demo method delared in incomplete class has complited");
	}
	
	public void demo2()
	{
		System.out.println("Demo method delared in incomplete class has complited");
	}
	
	public static void main(String[] kk)
	{
		Concrete ref=new Concrete();
		ref.demo();
		ref.demo2();
		ref.test();
		ref.test2();
	}

}
