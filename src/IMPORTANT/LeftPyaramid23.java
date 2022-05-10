package IMPORTANT;

public class LeftPyaramid23 {

	public static void main(String[] args)
	{
		 int a,b,c;
	        
	        for(a=1; a<=5; a++)
	        {
	            for(b=1; b<=5; b++)
	            {
	                System.out.print(" ");
	            }
	            for(c=1; c<=a; c++)
	            {
	               System.out.print("*"); 
	            }
	            System.out.println();
	        }
	         for(a=1; a<=5; a++)
	        {
	            for(b=1; b<=a; b++)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }    

	}

}
