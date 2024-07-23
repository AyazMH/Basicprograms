package access_specifiers2;
// WAP What happens outside the package by becoming the sub class
// We will use extend keyword to create the relationship between the classes hence the sub class will be created
import access_specifiers.States;
public class Language extends States
{

	public static void main(String[] args) 
	{
		Language L1= new Language();
		L1.Karnataka();
		L1.Kerala();
		
	}

}
