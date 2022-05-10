package Polymorphism;

public interface Inface   // Interface is by default Public.
{
    int a=10;   // In Interface Variable is by default public, final ,Static.
    
    void demo();// Non static method declared in interface by default abstract and public.
    
    static void demo1()
    {
    	System.out.println("In interface Static method Must be complete");
    }
    public static void main(String[] args)
    {
    	System.out.println(Inface.a);
    	Inface.demo1();
		
	}
}
