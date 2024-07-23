package array_programs;
//WAP to store five batsman run / 5 students roll number 
import java.util.Arrays;

public class Array_Programs 
{

	public static void main(String[] args) 
	{
		int rollno[]=new int[5];
		
		rollno[0]=20;
		rollno[1]=25;
		rollno[2]=27;
		rollno[3]=29;
		rollno[4]=30;
		System.out.println(Arrays.toString(rollno));
		
		
		int run[]=new int[5];
		
		run[0]=65;
		run[1]=87;
		run[2]=34;
		run[3]=77;
		run[4]=88;
		run[4]=100;
		System.out.println(Arrays.toString(run));
		int total=run[0]+run[1]+run[2]+run[3]+run[4];
		System.out.println("The Total Run is "+total);
	}

}
