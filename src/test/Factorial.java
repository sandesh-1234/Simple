package test;

public class Factorial {

	public static void main(String[] args)
	{
		int c=1;
		int d;
		int i;
		for( i=1; i<=10; i++) 
		{
			d=i*c;
			System.out.println(d);
			c=d;
		}

	}

}
