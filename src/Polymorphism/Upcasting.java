package Polymorphism;

public class Upcasting extends Casting
{
	public void name()
	{
		System.out.println("changed body");
	}
	public void name2()
	{
		System.out.println(" i am excellent");
	}
	
	public static void main(String[] args) 
	{
		Casting ref=new Upcasting();
		ref.name();
		ref.name2();
	}

}
