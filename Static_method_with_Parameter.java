package java_basics;

public class Static_method_with_Parameter 
// WAP on CAlling static method with Parameter
{
	static void myscore(int a)
	{
		System.out.println(" My age is " +a);
	}
	static void myname(String b)
	{
		System.out.println(" My NAme is " + b);
	}
	static void bloodgroup(char c)
	{
		System.out.println(" My Blood group is "+ c);
	}
	static void myweight(double d)
	{
		System.out.println(" My Weight is " + d);
	}
	public static void main(String[] args) 
	{
		System.out.println(" -:My Details are:-");
		myscore(28);
		myname("AYAZ");
		bloodgroup('o');
		myweight(75.6);
	}

}
