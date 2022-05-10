package IMPORTANT;

public class Leftrhombus {

	public static void main(String[] args) {
		 int a,b,c;
	        
		
			for(a=1; a<=5; a++)
	        {
	            for(b=a; b<=4; b++)
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
	              System.out.print(" ");
	            }
	            for(c=a; c<=4; c++)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
