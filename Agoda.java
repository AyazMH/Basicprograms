package abstract_class;
//WAP in which Super class have 2 concrete methods
//			   Abstract class with 2 abstract and 2 concrete methods
//			   Subclass with 2 concrete methods

class Fly_Emirates
{
	void flightdubai()	//-------> Concrete Method-1
	{
		System.out.println("WELCOME TO FLY EMIRATES");
		int Km1=2567;
		double Km2=6789.57;
		double total=Km1+Km2;
		System.out.println("The total travel by Fly emirates "+total);
	}
	static void flightqatar()	//-------> Concrete Method-2
	{
		int Km1=2555;
		int trip=15;
		int total2=Km1*trip;
		System.out.println("The total trip in month by Fly emirates "+total2);
	}
}
abstract class Air_Arabia extends Fly_Emirates
{
	abstract void flight1();  //-------> Abstract Method-1
	abstract void flight2();  //-------> Abstract Method-1
	
	void fligh_to_India()     //-------> Concrete Method-1
	{
	int flightBLR=55;
	int flightMUM=44;
	int sum=flightBLR+flightMUM;
	System.out.println("The total number of flights to INDIA "+sum);
	}
	static void welcome()     //-------> Concrete Method-2
	{
		System.out.println("WELCOME TO AIR ARABIA");
	}
}
public class Agoda extends Air_Arabia 
{
	static void flights_FE()	//-------> Concrete Method-1
	{
		{
			int speed1=300;
			int speed2=200;
		if(speed1>speed2)
		{
			System.out.println("Fly Emirates arrived earlier than Air Arabia");
		}
		else
		{
			System.out.println("Air Arabia arrived earlier than Fly Emirates");
		}
		}
	}
	void flights_AA()		//-------> Concrete Method-2
	{
		System.out.println("Air Arabia is best flight in Arab ");
	}
	void flight1() 
	{
		System.out.println("The Flight1 is Fly Emirates");
	}
	
	void flight2() 
	{
		System.out.println("The Flight2 is Air Arabia");

	}
	public static void main(String[] args) 
	{
		Agoda A1= new Agoda();
		A1.flightdubai();
		flightqatar();
		
		welcome();
		A1.flights_AA();
		A1.fligh_to_India();
		
		A1.flight1();
		A1.flight2();
		
		flights_FE();
		
	}
}
