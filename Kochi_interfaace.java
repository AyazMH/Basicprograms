package inter_face;
//WAP in which Interface having 2AM and abstract class having 2AM & 2CM 
interface Bengaluru     //------------> Interface
{
	abstract void BMTC();      //------------> Abstract method1
	abstract void BMRCL();    //------------> Abstract method2
}
abstract class chennai implements Bengaluru    //------------> Abstract class
{
	abstract void CMTC();       //------------> Abstract method1
	abstract void CMRCL();      //------------> Abstract method2

	void beach()				//------------> Concrete method1
	{
		System.out.println("The Beach1 name is Marina");
	}
	static void stadium()			//------------> Concrete method2
	{
		System.out.println("The Stadium1 name is Chepauk");

	}
	}
public class Kochi_interfaace extends chennai //------------> child class
{
	void beach2()				//------------> Concrete method1
	{
		System.out.println("The Beach 2 name is Bekal");
	}
	static void stadium2()			//------------> Concrete method2
	{
		System.out.println("The Stadium 2 name is KMCC");

	}
	public void BMTC() 
	{
	System.out.println("This is Abstract method-1 in Interface");

	}
	public void BMRCL()
	{
		System.out.println("This is Abstract method-2 in Interface");

	}
	void CMTC() 
	{
		System.out.println("This is Abstract method-1 in Abstract class");

	}
	void CMRCL()
	{
		System.out.println("This is Abstract method-2 in Abstract class");

	}
	public static void main(String[] args) 
	{
		Kochi_interfaace K1=new Kochi_interfaace();
		K1.BMTC();
		K1.BMRCL();
		K1.CMTC();
		K1.CMRCL();
		K1.beach();
		K1.beach2();
		stadium();
		stadium2();

	}
}
