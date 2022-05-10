package box;

public class Array 
  {
	public static void main(String[] args)
	  {
		int s[] = {10, 11, 15, 34, 29};
		String[]w= {"Sandesh", "Shubham", "Roahan", "Rahul", "Bhagesh"};
		
		
		System.out.println(s);
		
		System.out.println(s[3]);// it shows 3rd position index.
		
		int z=s[0]+s[4];
		System.out.println(z);// Addition of 2 no from string
		
		System.out.println(w[3]);//it shows 3rd index
		System.out.println(w[3].charAt(3));// it shows 3rd index in 3rd index position character
		
		String Bike[] = new String[5];// Fixed size array
		Bike[0]= "Hero";
		Bike[1]= "Shine";
		Bike[2]= "Pulser";
		Bike[3]= "Honda";
		Bike[4]= "KTM";
		//Bike[5]= "Luna";
		
		System.out.println(Bike[4]);
		
	}

}
