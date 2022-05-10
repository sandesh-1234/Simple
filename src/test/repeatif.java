package test;

public class repeatif {
	public static void main(String[] args)
	{
		int a=20;
		int b=37;
		int c=24;
		
		if(a>b)//false
		  {
			if(a>c)//false
			{
				System.out.println("a is greater no");
			}
			else
			{
				System.out.println("c is greater no");
			}
			
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greatest no");
			}
			else
			{
				System.out.println("c is greater no");
			}
		}
			
			
	}

}
