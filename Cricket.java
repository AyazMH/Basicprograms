package inheritance;
// WAP on method overriding with super keyword
class team_1
{
	void IPL()
	{
		int run=15;
		System.out.println("CHAMPIONS");
		System.out.println("KOLKATA KNIGHT RIDERS WON BY "+run+" runs");
	}
}
class team_2 extends team_1
{
	void IPL()
	{
		super.IPL();//------------> super keyword
		int run=15;
		System.out.println("RUNNERS");
		System.out.println("SUNRISERS HYDERABD LOST BY "+run+" runs");
	}
}

public class Cricket extends team_2
{
	void IPL()
	{
		super.IPL(); //------------> super keyword
		int wicket=5;
		System.out.println("FIRST RUNNER UP");
		System.out.println("RAJASTHAN ROYALS LOST BY "+wicket+" Wickets");
	}

	public static void main(String[] args) 
	{
		Cricket C1=new Cricket();
		C1.IPL();
	}

}
