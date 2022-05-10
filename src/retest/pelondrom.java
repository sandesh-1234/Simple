package retest;

public class pelondrom {

	public static void main(String[] args)
	{
		int no=1, b, c, d;
		//for(no=11; no<=1500; no++)
		while(no<=1000)
		{
			d=0;
			//for(b=no; b>0; b=b/10)
			{
				b=no;
				c=b%10;//1
				d=d*10+c;//1
				no++;
			}
			if(d==no)
			{
				System.out.println(no);
			}
		}
	
	}

}
