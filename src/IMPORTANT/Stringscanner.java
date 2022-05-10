package IMPORTANT;

import java.util.Scanner;

public class Stringscanner {

	public static void main(String[] args) 
	{
        Scanner ref=new Scanner(System.in);
        String name=ref.nextLine();
        
        int size=name.length();
        System.out.println(size);
        
        for(int a=size-1; a>=0; a--)
        {
        	char b=name.charAt(a);
        	if(b==' ' || b!=' ')
        	{
        		System.out.print(b);
        	}
        }
        
        
	}

}
