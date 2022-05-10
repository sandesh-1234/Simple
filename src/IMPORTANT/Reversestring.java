package IMPORTANT;

public class Reversestring {

	public static void main(String[] args)
	{
		 String name="i want ten lack per annum";
	        int size=name.length();
	        System.out.println(size);
	        
	        for(int b=size-1; b>=0; b--)
	        {
	            char c=name.charAt(b);
	            if(c!=' '|| c==' ')
	            {
	                System.out.print(c);
	            }
	        }
	        System.out.println();
	        int temp=0;
	        for(int b=0; b<=size-1; b++)
	        {
	            char c=name.charAt(b);
	            if(c=='n')
	            temp++;
	        }
	        
	        System.out.println(temp+ "times n has come");
	    } 

	}


