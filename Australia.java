package inter_face;
//WAP to Achieve the Multiple level inheritance by interface
interface England
{
	void Match_1();
}
interface Newzealand
{
	void Match_2();
}
public class Australia implements England,Newzealand
{
	public void Match_2() 
	{
		System.out.println("Match-1 :> Australia Won by 85 Runs ");
	}

	public void Match_1() 
	{
		System.out.println("Match-2 :> Australia Won by 7 Wickets ");

	}
	public static void main(String[] args) 
	{
		System.out.println("WORLD CUP MATCH RESULTS ");
		
		Australia A1=new Australia();
		A1.Match_1();
		A1.Match_2();
	}
}
