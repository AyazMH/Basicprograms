package array_programs;
// WAP to check the 15 is present in the given set of array belonging to int data type
public class Number_Present
{
		static int No_t0_check=15;
	public static void main(String[] args) 
	{
			int no[]= {45,78,42,15,23};
			
			for(int i=0; i<no.length; i++)
			{
				if(No_t0_check==no[i])
				{
					System.out.println("The number 15 is present in the set of array and its Index is ---> " +i);
				}
				//else
				//{
					//System.out.println("The number 15 is NOT present in the set of array");

				//}
			}
		
	}

}
