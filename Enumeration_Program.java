package colletions;
//WAP Using Enumeration concept for legacy classes
import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Program
{

	public static void main(String[] args)
	{
		Vector a2=new Vector();
		a2.add(99);
		a2.add(11);
		a2.add(12);
		a2.add(13);
		a2.add(14);
		a2.add("Null");
		a2.add(99);
		a2.add(99);
		a2.add(99);
		
		System.out.println(a2);
		Enumeration E1= a2. elements();
		while(E1.hasMoreElements())
		{
			System.out.println(E1.nextElement());
		}
	}

}
