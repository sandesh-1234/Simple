package retest;

public class Variables 
{    int a=10;
     static int b=25;
     public void run()
     {
    	  int f=34;
    	  System.out.println(f);
     }
     public static void test()
     {
    	  int k=34;
    	  System.out.println(k);
     }
  public static void main(String[] args)
   {
	  System.out.println(b);
		
	 Variables ref=new Variables();
	 System.out.println(ref.a);
ref.run();
	}

}
