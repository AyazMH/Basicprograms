package access_specifiers;
// WAP to Access specifier to call in main method within same package
class Earth
{
	public void Bay_of_Bengal()
	{
		System.out.println("The Great Bay of Bengal");
	}
	protected void Arabian_sea()
	{
		System.out.println("The Great Arabian Sea");
	}
	private void Pacific()
	{
		System.out.println("The Great Pacific Ocean");
	}
	void Red_sea()
	{
		System.out.println("The Great red Sea");
	}
}
public class Class_Ocean 
{

	public static void main(String[] args) 
	{
		Earth E1= new Earth();
		E1.Bay_of_Bengal();
		E1.Arabian_sea();
		E1.Red_sea();
	}
}
