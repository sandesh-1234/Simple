package test;

public class Object 
  { 
	int a=5;// global declaration// non Static 
    int b=10;
    int c=a*b;
    public void test()
    {
 	System.out.println("I am");
    }
    
   /* private void test1()
    {
 	System.out.println("I am");
    }*/
    
    
    protected void test2()
    {
    	System.out.println(" Am I");
    }
    
    void test3()
    
    {
    	System.out.println(" You are");
    }
    	public static void main(String[] args)
    	{
    		Object run=new Object();
    		System.out.println(run.a);  
    		System.out.println(run.b);
    		System.out.println(run.c);
    		run.test();
    		//run.test1();
    		run.test2();
    		run.test3();
         }
    
    
        
  }
	


