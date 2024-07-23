package colletions;

import java.util.LinkedList;

public class LinkedList_Own_Methods 
{

	public static void main(String[] args)
	{
		LinkedList L1=new LinkedList();
		L1.add("Warner");
		L1.add("Smith");
		L1.add("Marsh");
		L1.add("Maxwell");
		L1.add("Stoinis");
		L1.add("Zampa");
		
		System.out.println(L1);
		L1.addFirst("Travis");
		System.out.println(L1);
		L1.addLast("Cummins");
		System.out.println(L1);
		L1.removeFirst();
		System.out.println(L1);
		L1.removeLast();
		System.out.println(L1);
		
		L1.getFirst();
		System.out.println(L1);
		
		L1.getLast();
		System.out.println(L1);
		
		L1.pollFirst();
		System.out.println(L1);
		
		L1.pollLast();
		System.out.println(L1);
		
		
		
		
	}

}
