package retest;

public class Armstrong {

	public static void main(String[] args) 
	{
		int a, b, c, d, e, f;
		for(a=1; a<=5000; a++) 
		{
			
		b=a/10;//40
		c=a%10;//7
		d=b%10;//0
		e=b/10;//4
		
		
		f=e*e*e+d*d*d+c*c*c; //407
		
		if(a==f)
		{
			System.out.println(a+ " is armstrong no");
		}
		
		}
		

	}

}
