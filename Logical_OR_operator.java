package java_basics;

public class Logical_OR_operator 
// WAP on OR Operator and OR-NOT
{
	public static void main(String[] args)
	{
		int RR=56;
		int matchwon=9;
		
		if (RR>=55 || matchwon==9)
		{
			System.out.println("Qualified for the Playoffs");
		}
		if (RR<=55 || matchwon<=8)
		{
			System.out.println(" Out of the Tournament");
		}
		if (RR==55 || matchwon==10)
		{
			System.out.println(" TAble topper ");
		}
		if (!(RR>=55 || matchwon==9))
		{
			System.out.println("ORNOT Qualified for the Playoffs");
		}
		if (!(RR<=55 || matchwon<=8))
		{
			System.out.println(" ORNOT Out of the Tournament");
		}
		if (!(RR==55 || matchwon==10))
		{
			System.out.println(" ORNOT TAble topper ");
		}
	}

}
