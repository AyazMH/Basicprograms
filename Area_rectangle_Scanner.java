package java_basics;
import java.util.Scanner;
public class Area_rectangle_Scanner
// Area of rectangle using scanner class
{
	static Scanner s1=new Scanner(System.in);
	static void rectangle()
	{
		System.out.println(" Enter the lenghth");
		int a = s1.nextInt();
		System.out.println(" Enter the Breadth");
		int b = s1.nextInt();
		int area = a*b;
		System.out.println("The Area od rectangle is " +area);
	}

	public static void main(String[] args)
	{
		
		rectangle();
	}

}
