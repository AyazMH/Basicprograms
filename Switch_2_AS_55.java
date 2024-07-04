package java_basics;
//WAP to perform add,sub, multi,div using same 2 variables in switch case
import java.util.Scanner;
public class Switch_2_AS_55 
{

	public static void main(String[] args) 
	{
		Scanner S1=new Scanner(System.in);
		int a=S1.nextInt();
		//int b=S1.nextInt();
		switch(a)
		{
		case 1:
			int b1=45;
			int sum=a+b1;
			System.out.println("The Case 1 is "+sum);
		}	
	}

}
