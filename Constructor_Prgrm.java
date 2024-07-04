package java_basics;

public class Constructor_Prgrm 
// WAP on Calling constructor with or without parameter
{
	Constructor_Prgrm ()
	{
		System.out.println(" KKR IPL 2024 CHAMPIONS");
	}
	Constructor_Prgrm (int a)
	{
		System.out.println(" KKR WON BY "+a+"RUNS");
	}
	Constructor_Prgrm (int a ,int b)
	{
		System.out.println(" KKR WON BY "+a+"RUNS AND "+b+" wickets");
	}
	Constructor_Prgrm (String c)
	{
		System.out.println(" MVP of the Tournamnet"+c);
	}
	public static void main(String[] args)
	{
		System.out.println(" IPL FINAL MATCH RESULT");
		new Constructor_Prgrm();
		System.out.println(" MATCH RESULT WITH PARAMETER");
		new Constructor_Prgrm(56);
		new Constructor_Prgrm(56,7);
		new Constructor_Prgrm("NARINE");
		
	}

}
