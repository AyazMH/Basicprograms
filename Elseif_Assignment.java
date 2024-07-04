package java_basics;

public class Elseif_Assignment 
{
	public static void main(String[] args)
	{
	double a=88;
	if(a<=35)
	{
		System.out.println(" FAIL ");
	}
	else if (a<=50)
	{
		System.out.println(" D GRADE ");
	}
	else if (a<=65)
	{
		System.out.println(" C GRADE ");
	}
	else if (a<=85)
	{
		System.out.println(" B GRADE ");
	}
	else if (a<=100)
	{
		System.out.println(" A GRADE WITH DISTINCTION ");
	}
	else
	{
		System.out.println("Error");
	}
	}

}

