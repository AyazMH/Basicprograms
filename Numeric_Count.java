package string_functions;

//WAP to find the number of numeric in the given string
public class Numeric_Count
{
	static int count_of_digit=0;

	public static void main(String[] args) 
	{
		String S1="5000sqft";
		char c1[]=S1.toCharArray();
		
		//System.out.println(Arrays.toString(c1)); // ---> to convert to string (need to use import) 
		
		for(int i=0; i<S1.length(); i++)
		{
			boolean b1=Character.isDigit(c1[i]);
			if (b1==true)
			{
				count_of_digit++;
			}
		}
		System.out.println("The Number of Numeric Letters are  ---->  "+count_of_digit);
		
	}

}
