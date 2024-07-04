package java_basics;
import java.util.Scanner;
	
public class Sum_Numbers 
{
	static Scanner S1=new Scanner(System.in);
	static void add ()
	{
		System.out.println("Enter the Value of A");
		int a=S1.nextInt();
		System.out.println("Enter the Value of B");
		int b=S1.nextInt();
		int sum=a+b;
		System.out.println("The Addition of two numbers "+sum);
	}
	public static void main(String[] args) 
	{
		add();
	}

}
