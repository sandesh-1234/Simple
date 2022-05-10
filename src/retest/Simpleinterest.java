package retest;

public class Simpleinterest
{
     public static void main(String[] args)
       {
    	/* int P=5000, N=1, R=10, SI;// Year
    	 
    	 SI=P*N*R/100;
    
    	 
    	 System.out.println(SI);*/
    	 
    	 
    	 float p=1000, n, r=10, si, j;
    	 for(n=1; n<=12; n++)// Monthly
    	 {
    		 
    		 j=n/12;
    	 
    	 si=p*j*r/100;
    	 
    	 System.out.println(si+ " is monthly simple intrest");
    	 
	  }
       }
}
