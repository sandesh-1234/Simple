package test;

public class exam {
	int marks=100;
	public static void main(String[]  sk)
	
	{
	
		int marks=-10;
		
		//marks<=100
		//marks>=90 A+ grade
		//marks>=75 A grade
		//marks>=60 B grade
		//marks>=40 C grade
		//marks<=39 Fail
		
		if(marks>100)
		{
			System.out.println("Invalid marks");
		}
		else
		{
			if(marks>=90)
			{
				System.out.println("Student get A+ grade");
			}
			else {
				if(marks>=75)
				{
					System.out.println("Student get A grade");
				}
				else {
					if(marks>=60)
					{
						System.out.println("Student get B grade");
					}
					else {
						if(marks>=40)
						{
							System.out.println("Student get C grade");
						}
                           else  {
                                 if(marks<=39 && marks>=0)
                                     {
                                         System.out.println("Student get Failed");}
                                    }
						
						               {
							              if(marks<0)
							              {
								             System.out.println("Negative marks are invalid");
							              }
						}
						
						
					
						
					}
				}
				
			}
		}
		                               
	
	}

}