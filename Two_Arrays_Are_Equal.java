package array_programs;

import java.util.Arrays;

//WAP to check the two arrays are equal
public class Two_Arrays_Are_Equal
{

	public static void main(String[] args) 
	{
		int run1[]= {77,45,68,90,32,99};
		int run2[]= {77,45,68,90,32,99};
		
		boolean b1=Arrays.equals(run1, run2);
		if(b1==true)
		{
			System.out.println("The 2 Arrays are Equal ");
		}
		else
		{
			System.out.println("The 2 Arrays are Not Equal ");

		}
	
	}

}
