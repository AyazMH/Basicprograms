package java_basics;

public class AND_Opereator_with_NOT 
// WAP on AND with NOT
{
	public static void main(String[] args) 
	{
		int run=250;
	    int wicket =10;
	    if (!(run==200 && wicket==5))
	    {
	    	System.out.println("Match won with Good runrate");
	    }
	    if (run==200 && wicket==8)
	    {
	    	System.out.println("Match is won with Normal runrate");
	    }
	    if (!(run==200 && wicket==10))
	    {
	    	System.out.println("Match is Just won");
	    }
	}

}
