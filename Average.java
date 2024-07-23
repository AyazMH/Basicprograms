package array_programs;
//WAP to find the average of 4 Array numbers 
public class Average 
{
		static int sum;
		static double Avg;
	public static void main(String[] args)
	{
		//int no[]=new int[4];
		//no[0]=23;
		//no[1]=56;
		//no[2]=78;
		//no[3]=89;
		 
		int num[]= {56,67,89,75};    // ----> Another way of declaring the array value
		
		for(int i=0; i<num.length; i++)
		{
			sum=sum+num[i];
		}
		System.out.println("The Sum of 4 Numbers are --> "+sum);
		
		int Avg=sum/num.length;
		System.out.println("The Average of 4 numbers are --> "+Avg);
		
	}

}
