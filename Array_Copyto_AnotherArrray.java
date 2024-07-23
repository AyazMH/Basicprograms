package array_programs;

import java.util.Arrays;

//WAP to copy the value of one array into another Array using iteration
public class Array_Copyto_AnotherArrray 
{
	
	public static void main(String[] args)
	{
			//int no[]= new int [5];
			//no[0]=10;
			//no[1]=15;
			//no[2]=20;
			//no[3]=25;
			//no[4]=30;
			int no[]= {10,15,20,25,30};
			
			int no_copy[]= new int [no.length];
			for(int i=0; i<no.length; i++)
			{
				no_copy[i]=no[i];
			}
		System.out.println(Arrays.toString(no_copy));
		System.out.println(Arrays.toString(no));
		
	}

}
