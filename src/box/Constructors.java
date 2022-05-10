package box;

public class Constructors
  {
	public void test()
	{
		System.out.println(10);
	}
	Constructors()    //Zero Argument constructor// user defined Constructor
	{
		int a=13;
		int b=12;
		System.out.println(a-b+" Substraction  ");
	}
	
	Constructors(int a)    //parameterized constructor   //user defined Constructors
	{
		System.out.println("Hello welcome ");
	}
	
	Constructors(int a, int b)//parameterized constructor   //user defined Constructors
	{
		System.out.println("Parameterized Constructor");     
	}
	Constructors(int a, char b)
	{
		System.out.println(" We can use Different combinations of data types");  
	}
	Constructors(int a, char b, String d)//parameterized constructor   //user defined Constructors
	{
		System.out.println("We can pass multiple Parameters");
	}
	public static void main(String[] args)
	{
		Constructors ref=new Constructors(); 
		ref.test();
		Constructors ref1=new Constructors(45); 
		Constructors ref2=new Constructors(45,56); 
		Constructors ref3=new Constructors(45,'d'); 
		Constructors ref4=new Constructors(45,'d',"Sandesh"); 
	}

}
