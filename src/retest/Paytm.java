package retest;

import java.util.Scanner;

public class Paytm
{
	public static void main(String[] kk)
	{
		 int a=1234;
	Scanner ref=new Scanner(System.in);
	int amount=ref.nextInt();
	
	if(amount%100==0)
	{
		System.out.println("Enter the PIN");
		 int pin=ref.nextInt();
		 if(a==pin) 
		{
			System.out.println("Do you want reciept");
		}
		else
		{
			System.out.println("Enter valid PIN");
		}
		
	}
	else
	   {
		System.out.println("Enter Valid Amount");
	    }
	}
	
}
