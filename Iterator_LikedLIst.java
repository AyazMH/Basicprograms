package colletions;

import java.util.LinkedList;
import java.util.Iterator;
public class Iterator_LikedLIst 
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
		
		System.out.println(L1);
		
		Iterator I1=L1.iterator();
		
		while(I1.hasNext())
		{
			System.out.println(I1.next());
		}
		
		
		
	}

}
