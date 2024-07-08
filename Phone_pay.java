package abstract_class;
//WAP in which abstract class is present along with concrete class
abstract class hdfc // ----------> Abstract class
{
	abstract void add(); //----------> Abstract Method
}

public class Phone_pay extends hdfc //---------> concrete class
{
	void add() 
	{
		int credit1=1000;
		int credit2=4500;
		int sum=credit1+credit2;
		System.out.println(" The Total balance is "+sum);
	}
	public static void main(String[] args) // ---------> Concrete method
	{
		//Phone_pay P1= new Phone_pay();
		//P1.add();
		new Phone_pay().add(); // Another way of calling Not static method
	}
}
