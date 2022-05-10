package retest;

public class Accesss {
	
	static int b=15;//Global 
	public void test()//Non static method//
	{     int a=10;
		System.out.println(a);
	}
	void test1()
	{
		int c=2*10;
		System.out.println(c);
	}
	public static void main(String[] args)//Stack Area
	{
		Accesss run=new Accesss();
		run.test();
		System.out.println(b);
		run.test1();
	}

}
