package string_functions;
// WAP to check the given string is palindrome
public class String_Palindrome 
{

	public static void main(String[] args) 
	{
		String name= "MALAYALAM";
		String reverse="";
		
		for( int i=name.length()-1; i>=0; i--)
		{
			char c1=name.charAt(i);
			reverse = reverse+c1;
		}
		System.out.println(reverse);
		
		boolean result=name.equals(reverse);
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("The Name is Palindrome");
		}
		else
		{
			System.out.println("The Name is not a palidrome");
		}
		
	}

}
