package string_functions;
////WAP to find the number Special Character  in the given string

public class Splcharacter_Count 
{
	static int count_of_space=0;
	static int count_of_Alphabets=0;
	static int 	count_of_digit=0;

	public static void main(String[] args) 
	{
		String s1=" ##The Height of Mount *Everest* is 44000 Squrefeet!!!!!";
		char c1[]=s1.toCharArray();
		
		for(int i=0;i<s1.length();i++)
		{
			boolean b1=Character.isLetter(c1[i]);
			if (b1==true)
			{
				count_of_Alphabets++;
			}
		}
		System.out.println("The Number of Alphabets in Given string are --->  "+count_of_Alphabets);
//-------------------------------------------------------------------------------------------------------------------------------		 
		for(int i=0; i<s1.length(); i++)
		{
			boolean b1=Character.isDigit(c1[i]);
			if (b1==true)
			{
				count_of_digit++;
			}
		}
		System.out.println("The Number of Numeric Letters are  ---->  "+count_of_digit);
//---------------------------------------------------------------------------------------------------------------------------------------
		for(int i=0; i<s1.length();i++)
		{
			boolean b1=Character.isSpaceChar(c1[i]);
			
			if(b1==true)
			{
				count_of_space++;
			}
		}
		System.out.println("The Total number of Space in the gieven string is -->"  +count_of_space);
		
		int Spl_character= s1.length()-count_of_space-count_of_Alphabets-count_of_digit;
		System.out.println("The Total number of Special Character in the gieven string --->"  +Spl_character);
	}

}
