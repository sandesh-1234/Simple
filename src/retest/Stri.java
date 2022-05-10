package retest;

public class Stri
{
	public static void main(String[] args)
	  {
		String name="Hello this is Velocity Training institute";
		System.out.println(name);
		int Size=name.length();
		System.out.println(Size);
		
		for(int b=0; b<Size; b++)
		{
			char c=name.charAt(b);
			if(c!=' ')
			{
				System.out.print(c);
			}
		}   System.out.println();
		
		for(int b=0; b<Size; b++)
		{
			char c=name.charAt(b);
			if(c==' ')
			{
				System.out.println("Space at index "  +b);
			}
		}
		    int count=0;
		for(int b=0; b<Size; b++)
		{
			char c=name.charAt(b);
			if(c=='i')
			{   
			   count++;
			}
		}
		System.out.print(count);
		System.out.println();
		
		 String replaceString=name.replace('i','j');
		 System.out.println(replaceString);
		
	}

}
