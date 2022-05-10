package Polymorphism;

public final class Keyword 
 {
	final int a=10;
	  String b="Sandesh";
	
	
	public final void test() 
	{
		System.out.println("We have declared Non static Method with final Keyword");
	}
	
	public static final void test2()// We cant override because we used final keyword
	{
		System.out.println("We have declared Static Method with final Keyword");
	}
	public static void main(String[] args) 
	{
		Keyword ref = new Keyword();
		ref.test();
		ref.test2();
		System.out.println(ref.a);
		System.out.println(ref.b);
	}
	

}
