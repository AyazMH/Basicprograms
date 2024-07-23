package inter_face;
// WAP Class extends one class and implements another class
interface Delhi_Capitals
{
	abstract void Match1();
}
class Gujrat_Titans
{
	void Match3()
	{
		System.out.println(" THE VENUE IS ARUN JATELY STADIUM DELHI ");
	}
}
public class BCCI extends Gujrat_Titans implements Delhi_Capitals
{

	public void Match1() 
	{
		System.out.println(" MATCH-1 DELHI CAPITALS V/S GUJARAT TITANS");
	}
	void Match2()
	{
		System.out.println(" MATCH-2 DELHI CAPITALS V/S LUCKNOW SUPER GIANTS");

	}
	public static void main(String[] args)
	{
		System.out.println(" I P L FIXTURES");
		BCCI B1=new BCCI();
		B1.Match1();
		B1.Match2();
		B1.Match3();

	}
}
