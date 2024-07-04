package java_basics;
import java.util.Scanner;
public class Scanner_Class_ADD_Sub_Mul_Div_Mod 
// WAP to ADD,SUB,MUL,DIV,MOD USing Scanner class
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
	static void sub ()
	{
		System.out.println("Enter the Value of A");
		int a=S1.nextInt();
		System.out.println("Enter the Value of B");
		int b=S1.nextInt();
		int subt=a-b;
		System.out.println("The Subtraction of Two Numbers"+subt);	
	}
	static void mul ()
	{
		System.out.println("Enter the Value of A");
		int a=S1.nextInt();
		System.out.println("Enter the Value of B");
		int b=S1.nextInt();
		int multi=a*b;
		System.out.println("The Multiplication of Two Numbers"+multi);
	}
	static void div ()
	{
		System.out.println("Enter the Value of A");
		int a=S1.nextInt();
		System.out.println("Enter the Value of B");
		int b=S1.nextInt();
		int divid=a/b;
		System.out.println("The Division of Two Numbers"+divid);
	}
	static void mod ()
	{
		System.out.println("Enter the Value of A");
		int a=S1.nextInt();
		System.out.println("Enter the Value of B");
		int b=S1.nextInt();
		int modulus=a%b;
		System.out.println("The Modulus of Two Numbers"+modulus);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();	
	}

}
