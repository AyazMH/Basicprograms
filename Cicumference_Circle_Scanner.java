package java_basics;
import java.util.Scanner;
public class Cicumference_Circle_Scanner
{
	static Scanner s1=new Scanner(System.in);
	static double pi_value=3.14;
	static void circle()
	{
		System.out.println("Enter the value of Radius");
		int r=s1.nextInt();
		double circumference=2*pi_value*r;
		System.out.println("The Circumference of circle is "+circumference);
	}
	public static void main(String[] args)
	{
	circle();
	}

}
