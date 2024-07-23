package string_functions;
//WAP to find the number Space in the given string

public class Space_Count
{
	static int count_of_space=0;
	public static void main(String[] args)
	{
		String s1=" Switzerland is beautiful  country ";
		char c1[]=s1.toCharArray();
		
		for(int i=0; i<s1.length();i++)
		{
			boolean b1=Character.isSpaceChar(c1[i]);
			
			if(b1==true)
			{
				count_of_space++;
			}
		}
		System.out.println("The Total number of Space in the gieven string is -->"  +count_of_space);
	}

}
