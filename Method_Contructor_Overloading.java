package java_basics;

public class Method_Contructor_Overloading
//WAP Method overloading and Constructor overloading
{
	static void run(int a)
	{
		int runs=100+a;
		System.out.println(" The Total run is "+ runs);
	}
	void six(int a,int b)
	{
		int sixes=a+b;
		System.out.println(" Total Number of sixes "+sixes);
	}
	Method_Contructor_Overloading(String c)
	{
		System.out.println(" The Player name is "+c);
	}
	public static void main(String[] args)
	{
		System.out.println(" The Tournament Player info");
		run(567);
		//Method_Contructor_Overloading m1= new Method_Contructor_Overloading();
		//m1.six(21,25);
		new Method_Contructor_Overloading("TRAVIS HEAD");

	}

}
