package abstract_class;
//WAP Child class inherit parent class and Parent class inherit abstract grand parent class
// 0% Abstraction
abstract class Grand_parent
{
	abstract void add();
}
abstract class Parent_class extends Grand_parent
{
	void Sub()
	{
		System.out.println(" In the parent class");
	}
}
public class Child_class extends Parent_class
{
	void add()
	{
		System.out.println(" The abstract class ");
	}
	void mul()
	{
		System.out.println(" In the child class ");
	}

	public static void main(String[] args) 
	{
		Child_class C1= new Child_class();
		C1.add();
		C1.mul();
		C1.Sub();

	}
}
