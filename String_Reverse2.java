package string_functions;
//WAP to reverse a string - Valid way of reverse

public class String_Reverse2 
{

	public static void main(String[] args) 
	{
		String name="KARANATAKA";
		String reverse="";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			char c1=name.charAt(i);
			reverse=reverse+c1;
		}
		System.out.println(reverse);
		
	}

}
