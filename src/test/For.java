package test;

public class For {

	public static void main(String[] args)
	  {
		int i;
		int q;
		int a=1;
		/*for( i=0; i<=5; i++)
		{
			for( q=0; q<=i; q++) 
			{
				System.out.print(" *");
			}
		
		
			System.out.println( );
		}
		
		for( i=5; i>=1; i--)
		{
			for( q=1; q<=i; q++) 
			{
				System.out.print(" *");
			}
		
		
			System.out.println( );
		} */
		
		
		
		for( i=5; i>=1; i--)
		{
			for( q=1; q<=i; q++) 
			{
				System.out.print(" *");
			}
			System.out.println("  ");
		}
			for(i=1; i<=5; i++)
			  {
				for(q=1; q<=i; q++) {
					System.out.print(" *");
				}
				System.out.println();
			  }
			
	while(a<=10)
	{
		System.out.println(" *");
		a++;
	}
	  }

}
