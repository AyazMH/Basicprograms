package inheritance;
// WAP on Multilevel inheritance using static and NON static methods
class Delhi
{
	static void delhi_bat()
	{
		int run1=88;
		int run2=69;
		int total=run1+run2;
		System.out.println("The Total Runs scored by delhi Caps ----> "+total);
	}
	void delhi_runrate()
	{
		double rr1=4.567;
		double rr2=3.787;
		double totalrr=rr1+rr2;
		System.out.println("The total Runrate of Dlehi caps is ----> " +totalrr);
	}
}
class chennai extends Delhi
{
	static void chennai_bat()
	{
		int run1=78;
		int run2=59;
		int total=run1+run2;
		System.out.println("The Total Runs scored by Chennai kings ---->"+total);
	}
	void chennai_runrate()
	{
		double rr1=2.567;
		double rr2=2.787;
		double totalrr=rr1+rr2;
		System.out.println("The total Runrate of chennai kings is ----> " +totalrr);
	}
}
public class Bangalore_Class extends chennai
{
	static void banglore_bat()
	{
		int run1=65;
		int run2=49;
		int total=run1+run2;
		System.out.println("The Total Runs scored by royals bangalore---> "+total);
	}
	void banglore_runrate()
	{
		double rr1=0.967;
		double rr2=1.667;
		double totalrr=rr1+rr2;
		System.out.println("The total Runrate of bangalore royals is ---> " +totalrr);
	}


	public static void main(String[] args) 
	{
		System.out.println(" -: The IPL 2024 :-");
		
		delhi_bat();
		Bangalore_Class b1=new Bangalore_Class();
		b1.delhi_runrate();
		chennai_bat();
		b1.chennai_runrate();
		banglore_bat();
		b1.banglore_runrate();	
	}

}
