package string_functions;
// WAP to find the number Alphabets in the given string
public class Alphabet_Count 
{
	static int count_of_Alphabets=0;
	public static void main(String[] args) 
	{
		String s1="44000 Squrefeet";
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
	}

}
