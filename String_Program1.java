package string_functions;
//WAP using charAt, index of char, subString- Single and double
public class String_Program1
{

	public static void main(String[] args) 
	{
		String a= "taj mahal is one of the seven wonders in the world";
		char C1=a.charAt(20);   //------> To find at 20th position which letter
		System.out.println(C1);
		
		int I1	=a.indexOf('f');    // -------> To find any letter at which position
		System.out.println(I1);
		
		String b="         Hai Good Morining              ";
		String trim=b.trim();        // ---------> To remove the space before and after of the string
		System.out.println(trim);
		
		String D1=a.substring(10);         // ---------> From the 10 th position string will start 
		System.out.println(D1);
		
		String F1=a.substring(4, 9);            // --------------> staring and ending of the string
		System.out.println(F1);
		
		String G1="Marnus";
		String G2=G1.substring(1); 
		System.out.println(G2);
		
		String G3=G1.substring(1,4);  
		System.out.println(G3);
	}

}
