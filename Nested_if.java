package java_basics;

public class Nested_if 
{
	public static void main(String[] args) 
	{
      int a=70;	
      int b=100;
      int c=80;
      System.out.println("Qualification for Knock out");
      
    if (b==100)
    {
    	
    	if(a>=c)
    	{
    		System.out.println(" Team is Qualified to knockout");
    	}
    	else if (a<=c)
    	{
    		System.out.println(" Team is out of the league");
    	}
	}
    else
    {
    	System.out.println("Try in your next match");
    }
	}
}

