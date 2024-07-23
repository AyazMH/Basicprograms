package inheritance;
// WAP on Single level inheritance using static and NON static methods
class ParentClass
{
	static void add()
	{
		int a=40;
		int b=30;
		int sum= a+b;
		System.out.println("The Sum of two numbers "+sum);
	}
	void sub()
	{
		int a=50;
		int b=40;
		int subtract=a-b;
		System.out.println("The subtraction of two numbers "+subtract);
	}
}

public class ChildClass extends ParentClass
{
	static void mul()
	{
		int a=60;
		int b=50;
		int multi=a*b;
		System.out.println("The Multiplication of two numbers "+ multi);
	}
	void div()
	{
		int a=48;
		int b=6;
		int divi=a/b;
		System.out.println("The division of two numbers "+ divi);
	}

	public static void main(String[] args) 
	{
		add();
		mul();
		ChildClass c1=new ChildClass();
		c1.sub();
		c1.div();
		
	}

}
