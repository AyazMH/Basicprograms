package inheritance;
// WAP on this calling statement with parameterized and non parameterized
public class This_Calling_Statement 
{
	This_Calling_Statement()
	{
		System.out.println("The Statement 1 Non Parameterized ");
	}
	This_Calling_Statement(int a)
	{
		this();
		int sum=100+a;
		System.out.println("The Statement 2 and Sum of numbers is "+sum);
	}
	This_Calling_Statement(double a)
	{
		this(10000);
		double pi_value=3.14;
		double sum=a+pi_value;
		System.out.println("The Statement 3 and Sum of numbers is "+sum);
	}
	This_Calling_Statement(int a, int b)
	{
		this(44.44);
		int mul=a*b;
		System.out.println("The Statement 4 and Multiplication of numbres is "+mul);
	}
	This_Calling_Statement(int a, double b)
	{
		this(287,900);
		double sum=a+b;
		System.out.println("The Statement 5 and Sum of numbers is "+sum);
	}
	public static void main(String[] args) 
	{
		new This_Calling_Statement(45,56.89876);
	}

}
