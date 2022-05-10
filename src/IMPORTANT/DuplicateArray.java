package IMPORTANT;

public class DuplicateArray {

	public static void main(String[] args)
	{
		int a[]={12,67,12,34,79,17,67,89,55,34,56,76};
	    
        for(int i=0; i<a.length; i++)
        {  
           for(int j=i+1; j<a.length; j++)
           {  
               if(a[i] == a[j])  
                   System.out.println(a[j]+ " is duplicate no");  
           }  
       }  

	}

}
