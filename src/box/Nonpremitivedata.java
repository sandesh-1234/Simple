package box;

public class Nonpremitivedata {

	public static void main(String[] kk) {
		String a="Sandesh";
		String b="Sandesh kundurkar";
		System.out.println(a);
		System.out.println(a.length());
		System.out.println(a.charAt(3));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());  
		System.out.println(a.concat(" Brave"));	
		System.out.println(a.substring(0,4));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.contains(b));	
	}

}
