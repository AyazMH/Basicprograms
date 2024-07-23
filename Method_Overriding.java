package inheritance;
// WAP on Method overloading 
class Notebook
{
	void pen()
	{
		int a=100;
		int b=5000;
		double c=35.56;
		double sum=a+b+c;
		System.out.println(" Class Notebook and Total count is "+sum);
	}
}
public class Method_Overriding extends Notebook
{
	void pen()
	{
		double a=10.00;
		int b=4000;
		double sum=a+b;
		System.out.println(" Class Method overloading and Total count is "+sum);
		//super.pen();
	}

	public static void main(String[] args) 
	{
		Method_Overriding M1=new Method_Overriding();
		M1.pen();
	}

}
