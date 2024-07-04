package java_basics;
import java.util.Scanner;
//WAP on Switch case
public class Switch_AS56 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the Case value");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		switch(a)
		{
		case 1:
		System.out.println("Australia");
		break;
		
		case 2:
		System.out.println("England");
		break;
		
		case 3:
		System.out.println("New Zealand");
		break;
		
		case 4:
		System.out.println("West indies");
		break;
		default:
		System.out.println("India");
		}
	}

}
