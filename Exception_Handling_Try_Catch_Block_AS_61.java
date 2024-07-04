package java_basics;
// WAP on Exceptional handling using Try_Catch block

public class Exception_Handling_Try_Catch_Block_AS_61 
{

	public static void main(String[] args) 
	{
		try
		{
		int  a=1/0;
		System.out.println(a);      //-------------> This block will execute when exception not occurs
		}
		catch (ArithmeticException a1)
		{
			System.out.println("Exception handled Succesfully");   //-------------> This block will execute when exception occurs
		}
		
	}

}
