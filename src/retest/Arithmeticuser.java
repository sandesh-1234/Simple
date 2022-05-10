package retest;

import java.util.Scanner;

public class Arithmeticuser
{
   public static void main(String[] args)
       {
	      Scanner run=new Scanner(System.in);
	      System.out.println("Enter first no");
	      int a=run.nextInt();
	      
	      System.out.println("Enter Second no");
	      int b=run.nextInt();
	      
	      int c=a+b;
	      int d=a-b;
	      int e=a*b;
	      int f=a/b;
	      int g=a%b;
	      
         System.out.println(c+ " "+d+e+f+g);
	}

}
