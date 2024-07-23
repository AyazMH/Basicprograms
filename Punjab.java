package inheritance;
// WAP on Hierarchical inheritance
class mumbai
{
	static void Mi()
	{
		int a=55;
		int b= 65;
		int sum= a+b;
		System.out.println(" The Sum is "+sum);
	}
}
class kolkata extends mumbai
{
	static void Kkr()
	{
		int c=67;
		int d=57;
		int Mul=c*d;
		System.out.println(" The Multiple of two Numbers are "+Mul);
	}
}
public class Punjab extends mumbai
{
	static void Pbs()
	{
	  int e=30;
	  int f=40;
	  int div=f/e;
	  System.out.println("The division of numbers "+div);
	  
	}
	

	public static void main(String[] args) 
	{
		//Punjab p1=new Punjab();
		//p1.Kkr();
		Pbs();
		Mi();
		

	}

}
