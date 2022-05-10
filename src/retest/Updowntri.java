package retest;

public class Updowntri 
{
	public void test()
	{
		 int a, b, c;
			for(a=1; a<=5; a++)
			{

			   for(b=a; b<5; b++)
			   {
				System.out.print(" ");
			   }
			   for(c=1; c<=a; c++)
			   {
				System.out.print(" *");
			   }
	            System.out.println();
			}   
	            	for(int d=1; d<=4; d++)
					{
						for(int e=1; e<=d; e++)
						{
							System.out.print(" ");
						}
						for(int f=d; f<=4; f++)
						{
							System.out.print(" *");
						}
						System.out.println();
					}
			  
	 }
			
			
	
  public static void main(String[] args) 
     {  
	    Updowntri ref=new Updowntri();
	     ref.test();
	     ref.test();
	     ref.test();
    }
}
