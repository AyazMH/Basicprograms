package array_programs;
import java.util.Arrays;
// WAP to store runs in array and input using scanner
import java.util.Scanner;
public class Array_Scanner_Program 
{

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Fall of Wicket");
		int W=Sc.nextInt();
		int run[]=new int[W];
		
		run[0]=65;
		run[1]=87;
		run[2]=34;
		run[3]=77;
		run[4]=88;
		run[5]=5;
		run[6]=17;
		run[7]=24;
		run[8]=7;
		run[9]=8;
		System.out.println("The Runs are");
		System.out.println(Arrays.toString(run));
		
		int total=run[0]+run[1]+run[2]+run[3]+run[4];
		System.out.println("The Total Run is "+total);
	}

}
