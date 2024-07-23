package inheritance;
// WAp on super calling statement with parameterized and non parameterized
class America
{
	America(int a)
	{
		System.out.println(" America is statment 1");
	}
}
class Engalnd extends America
{
	Engalnd(int a, double b)
	{
		super(200);  //-------> Super calling statement explicitly
		System.out.println(" Engaland  is statment 2");

	}
}
class Africa extends Engalnd
{
	Africa ()
	{
		super(100,45.88);//-------> Super calling statement explicitly
		System.out.println(" Africa is statment 3");

	}
}

public class Australia extends Africa
{
	Australia(double a,double b)
	{
		////-------> Super calling statement implicitly
		System.out.println(" Australia is statment 4");

	}

	public static void main(String[] args)
	{
		new Australia(45.55,57.99);
	}
}


