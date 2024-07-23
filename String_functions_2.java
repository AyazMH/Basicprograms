package string_functions;

import java.util.Arrays;

// String functions 2
public class String_functions_2 {

	public static void main(String[] args) 
	{
		String S1="Coorg is the Scotland of india";
		boolean b1=S1.contains("Scotland");   // -------> to find the particular word present 
		System.out.println(b1);
		
		String S2="Coorg is the Kashmir of Karnataka";
		boolean b2=S2.endsWith("Karnataka");  // ----> to find the suffix present
		System.out.println(b2);
		
		
		String S3="australia";
		char c[]=S3.toCharArray();   //-------> to convert the string to Array
		System.out.println(Arrays.toString(c));
	}

}
