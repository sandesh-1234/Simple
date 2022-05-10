package Polymorphism;

public class Casting 
{
	public void name()
	{
		System.out.println("Hello How are you");
	}
	
	public void name2()
	{
		System.out.println("I am fine");
	}
	public static void main(String[] kk)
	{
	 int a=10;
	 System.out.println(a);
	 double b=a;  //implicite casting also called as widening casting
	 System.out.println(b);
	 
	 
	 byte c =40;
	 System.out.println(c);
	 int d=c;
	 System.out.println(d);
	 
	 
	 
	 
	 double e=10.75;
	 System.out.println(e);
	 int f=(int) e;   //Explicite Casting it also called Norowwing  Casting.
	 System.out.println(f);
	 
	}

}
