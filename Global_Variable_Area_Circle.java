package java_basics;

public class Global_Variable_Area_Circle 
//WAP on Area of circle using global variable
{
	static double pi=3.14;
	static void area()
	{
		int r=10;
		double area=pi*r*r;
		System.out.println(area);
	}
	public static void main(String[] args) 
	{
		System.out.println("Area of circle is ");
		area();
		System.out.println("Updated area of circle is ");
		int r=15;
		double area=pi*r*r;
		System.out.println(area);
		
	
	}

}
