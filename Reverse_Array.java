package array_programs;

import java.util.Arrays;

//WAP to reverse the Array and store it in the new array
public class Reverse_Array
{
	static int a=0;
	public static void main(String[] args) 
	{
			int no[]= {22,33,44,55,66};
			int no_new[]=new int[no.length];
			for(int i=no.length-1; i>=0; i--)
			{
				no_new[i]=no[a];
				a++;
			}
			System.out.println("Old Array --->  "+Arrays.toString(no));
			System.out.println("Reversed Array --->  " +Arrays.toString(no_new));
			

	}

}
