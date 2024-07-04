package java_basics;
//WAP On Main method overloading
public class MainMethod_Overloading_AS_57 
{
	public void main(String name)
	{
		System.out.println("Main method 1");	
	}
	public static void main(int Salary)
	{
		System.out.println("Main method 2");	

	}
	public static void main(double percentage)
	{
		System.out.println("Main method 3");	

	}
	public static void main(String[] args)
	{
		MainMethod_Overloading_AS_57 A1= new MainMethod_Overloading_AS_57();
		A1.main("AYAZ");
		main(10000);
		main(99.99)
;
	}

}
