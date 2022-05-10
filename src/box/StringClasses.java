package box;

public class StringClasses {

	public static void main(String[] args)
	{
		String a="Sandesh";
		
		StringBuilder build=new StringBuilder(a);
		
		StringBuffer buff=new StringBuffer("Goal is big");
		
//		build.append("anand");
//		System.out.println(build);
		build.reverse();
		System.out.println(build);
		

	}

}
