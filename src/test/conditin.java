package test;

public class conditin 
     {
	public static void main(String[]  args)
	  {
		int money=350;
		if(money%100==0)
		{
			System.out.println("Enter your PIN");
		}
		else
		{
			System.out.println("please enter valid amount");
		}
		
		// Another example
		
		int shirtsize=40;
		
		if(shirtsize<=30)
		{
			System.out.println("shirtsize is L");
		}
		else
		{  
			System.out.println("shirtsize is XL");
		}
		
		int rs=5;
		if(rs==4)
		{
			System.out.println("water start to drop");
		}
		else
		{
			System.out.println("please put coin of 5");
		}

}
}