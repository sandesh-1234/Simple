package box;

public class Spaceindex 
  {
	public static void main(String[] args)
	 {
		String x=" I want 10 Lack per Annum";
		int size=x.length();
		//System.out.println(size);
		for(int a=0; a<size; a++)
		{
			char b= x.charAt(a);
			if(b==' ')
			{
		       System.out.println("Space at index "  +a);
			}
			else
			{
				System.out.println("Character at index  "  +a);
				
			}
			
		}
	 }
}
