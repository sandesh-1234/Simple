package box;

public class Rettype 
 {
	public int start(int a, int b)//Return type is int means method will return method value.
	{
		int c=a+b;
		return c;// will return mentioned value.
		
	}
	public static String start1()
	{
		String q="Velocity";
		System.out.println(q);
		return q;
	}
	public static void main(String[] args)
	{
		Rettype ref=new Rettype();
		int d=ref.start(10, 20);
		System.out.println(d+40);
		//String s=Rettype.start1();
		//System.out.println(s+"Hello");
		Rettype.start1();
	}

}
