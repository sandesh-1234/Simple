package test;

public class objaccess// class can only be public or default 
  {
	public int a=10;// Throughout the project
	int b=20;//within the package
	protected int c=30;//within the package & inheritance required for outside the package
	private int d=40;//Within the class
	
	public void demo()
	{
		System.out.println("Hello i am public");
	}
	 void demo1()
		{
			System.out.println("Hello i am default");
		}
	 
	protected void demo2()
		{
			System.out.println("Hello i am protected");
		}
	private void demo3()
	    {
		System.out.println("Hello i am private");
	    }
	 public static void main(String[] args)
	 {
		 objaccess ref=new objaccess();
		 ref.demo();
		 ref.demo1();
		 ref.demo2();
		 ref.demo3();
		 Object run=new Object();
	 System.out.println(run.c);
	 run.test();
	 //run.test1();
	 run.test2();
	 run.test3();
}
}
