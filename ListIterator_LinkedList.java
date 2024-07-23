package colletions;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator_LinkedList 
{

	public static void main(String[] args)
	{
		LinkedList L1=new LinkedList();
		L1.add(21);
		L1.add(22);
		L1.add(23);
		L1.add(24);
		L1.add(25);
		L1.add(26);
		L1.add(99);
		L1.add(99);
		L1.add(99);
		
		ListIterator I1=L1.listIterator();
		System.out.println("Iteration in Forward Directrion");
		while(I1.hasNext())
		{
			System.out.println(I1.next());
		}
		System.out.println("Iterration in Backward Directrion");

		while(I1.hasPrevious())
		{
			System.out.println(I1.previous());
		}
	}

}
