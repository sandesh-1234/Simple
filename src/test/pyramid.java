package test;

public class pyramid {

	public static void main(String[] args) 
	{
		int a, b, c, i;
		for(a=1; a<=4; a++)
		{
			for(b=a; b<=3; b++)
			{
				System.out.print("  ");
			}
			for(c=4; c<=10; c++)
			{
				if(c%2==0)
				
			System.out.print(" * ");	
				
			}
			
			for(i=1; i<=a; i++)
             {
				System.out.print(" *  ");
			}
			
			System.out.println(  );
			c=c+2;
		}
            
		
	
	
	}

}
