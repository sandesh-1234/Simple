package box;

public class premitivestring 
{
	public static void premitivestring()
	{
		
	}
   public static void main(String[] args) 
     {
	   String aim="I want 10 Lack Per Annum";
		int size=aim.length();
		//System.out.println(size);
		//System.out.println(aim);
		int space=0;
		int character=0;
		
		/*for(int a=size-1; a>=0; a--)
		{
			char b= aim.charAt(a);
			if(b!=' ')
			{
		
				System.out.print(aim.charAt(a));
			}
			
		}
		System.out.println();

		for(int a=0; a<=size-1; a++)
		{
			char b= aim.charAt(a);
			if(b!=' ')
			{
				System.out.print(aim.charAt(a));
			}
		}
		
		System.out.println();*/
		
		for(int a=0; a<=size-1; a++)
		{
			char b= aim.charAt(a);
			if(b==' ')
			{ 
				space++;
				
			}
			else
			{
				character++;
			}
			
		}
		System.out.print(space+ " Spaces in between the declared in String");
		System.out.println();
		System.out.print(character+ " character declared in String");
	}

}
