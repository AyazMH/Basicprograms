package inter_face;
// WAP on Interface by creating class and inheriting the interface

interface Bangalore
{
	void HSR();
	void MG_road();
}
public class Inheritance_Class implements Bangalore
{
	public void HSR() 
	{
		System.out.println("Interface HSR");
	}

	public void MG_road() 
	{
		System.out.println("Interface MG_road");

	}
	public static void main(String[] args)
	{
		Inheritance_Class C1= new Inheritance_Class();
		C1.HSR();
		C1.MG_road();
		new Inheritance_Class().HSR(); // Another way to call non static method
	}
}
