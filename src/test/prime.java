package test;

public class prime {

	public static void main(String[] args)  
	{
		int no=19, i, temp=0;
		
		for(i=2; i<=no-1; i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
				
			}
		}
		   if(temp>0) 
		   {
			  System.out.println(no+ " no is not prime");
		   }
		   else 
		   {
			System.out.println(no+ " no is prime");
		   }
		
		
		/*for(no=2; no<=500;no++)//2,3
		{  temp=0;
			for(i=2; i<=no-1; i++)//2<1   3<=2 
		
		    { 
                 
				if(no%i==0)//
			{
				temp=temp+1;//1,
				
			}
		    }
		   if(temp==0) 
		   {
			  System.out.println(  no );//2,3
		   }
		  
	   }*/
	}
}
