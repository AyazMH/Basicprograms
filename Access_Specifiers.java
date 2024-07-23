package access_specifiers;
// WAP to call all the access specifiers in methods inside the main method
public class Access_Specifiers 
{
	public void Match_1()
	{
		System.out.println(" MATCH > 1 - RCB V/S CSK");
	}
	protected void Match_2()
	{
		System.out.println(" MATCH > 2 - MI V/S LSG");

	}
	private void Match_3()
	{
		System.out.println(" MATCH > 3 - GT V/S KXIP");

	}
	void Match_4()
	{
		System.out.println(" MATCH > 1 - SRH V/S KKR");

	}

	public static void main(String[] args)
	{
		System.out.println(" IPL-2024 MATCH SCHEDULE ");
		Access_Specifiers A1= new Access_Specifiers();
		A1.Match_1();
		A1.Match_2();
		A1.Match_3();
		A1.Match_4();
		
	}

}
