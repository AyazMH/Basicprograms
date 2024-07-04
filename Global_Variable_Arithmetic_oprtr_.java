package java_basics;

public class Global_Variable_Arithmetic_oprtr_ 
// WAP On Different arithmetic operator using global variable 
{
	static int a=100;
	static double pi=3.14;
	static int b=200;
	static void add()
	{
		double sum=a+pi;
		System.out.println(sum);
	}
	static void sub()
	{
		int subt=b-a;
		System.out.println(subt);
	}
	static void mul()
	{
		double multi=pi*b;
		System.out.println(multi);
	}
	static void div()
	{
		int divide=b/a;
		System.out.println(divide);
	}
	static void mod()
	{
		int modulus=b%a;
		System.out.println(modulus);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Different arithmetic operator using global variable are");
		add();
		sub();
		mul();
		div();
		mod();
	}

}
