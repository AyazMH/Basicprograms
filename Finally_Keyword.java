package java_basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally_Keyword 
{
		static Scanner s1=new Scanner(System.in);
		public static void main(String[] args)
		{
			try
			{
			System.out.println("Enter your Age");
			int age=s1. nextInt();
			System.out.println("Your Age is  "+age);
			
			System.out.println("Enter your Salary");
			double Sal=s1. nextDouble();
			System.out.println("Your Salary is  " +Sal);

			System.out.println("Enter your Weight");
			float weight=s1. nextFloat();
			System.out.println("Your Salary is  " +weight);
			
			System.out.println("Verify You are a student ? YES/NO");
			boolean b1=s1. nextBoolean();
			System.out.println("I am a student " +b1);
			}
			catch (InputMismatchException ayaz)
			{
				System.out.println("Please Enter the details again correctly");
			}
			finally 
			{
				System.out.println("Finally Keyword will execute always");
			}
		}

	}
