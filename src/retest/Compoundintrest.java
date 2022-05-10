package retest;

public class Compoundintrest 
{
	public static void main(String[] args) 
	{
		/*int P=5000, N, R=5, Q, SI;
		for(N=1; N<=5; N++)//Years
		{
			 System.out.println(P+ " is next year principle");
   	         SI=P*N*R/100;
   	         System.out.println(SI+ " is intrest ");
   	          P=P+SI; 
	    }*/
		
		float i, N, SI, P=5000, R=10;
		
		for(N=1; N<=12; N++)//1 year
		{     i=N/12;
			 System.out.println(P+ " is next year principle");
   	         SI=P*i*R/100;
   	         System.out.println(SI+ " is intrest ");
   	          P=P+SI; 
	    }
	}
}
