package string_functions;
//WAP to convert the given string to Array when string have the space in B/w
import java.util.Arrays;

public class Split_String 
{

	public static void main(String[] args) 
	{
			String S1="icc t20 world cup";
				String S2[]	=S1.split(" "); //--------> first we need to declare the split
				System.out.println(Arrays.toString(S2)); //---------> Converting String to array according to the space
				
				
				System.out.println(S2[0]);
				System.out.println(S2[1]);
				System.out.println(S2[2]);
				System.out.println(S2[3]);
				
				// Split with two parameter
				
				String S3[]=S1.split(" ", 2);
				System.out.println(Arrays.toString(S3));
	}

}
