package IMPORTANT;

public class Pelindrome {

	public static void main(String[] args) 
	{
		int no,a,b,temp;
		
		for(no=11; no<=1000; no++)//888
		{
			temp=0;
			for(a=no; a>0;a=a/10)//888 88 8
			{
				b=a%10; //8 8 8
				temp=temp*10+b; //8 88 888
				
			}
			if(no== temp)
			{
				System.out.println("pelindrome no is" +no);
			}
		}
		
		
	}

}
