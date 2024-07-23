package colletions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.HashSet;

public class Different_collections 
{

	public static void main(String[] args) 
	{
		System.out.println("ArrayList:---------------------------------------------------------------");

		ArrayList a1=new ArrayList();
		a1.add(99);
		a1.add(22);
		a1.add(33);
		a1.add(44);
		a1.add(55);
		//a1.add("Null");
		a1.add(99);
		
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		
//------------------------------------------------------------------------------------------------------------------
		System.out.println("Vector:---------------------------------------------------------------");
		Vector a2=new Vector();
		a2.add(99);
		a2.add(11);
		a2.add(12);
		a2.add(13);
		a2.add(14);
		//a2.add("Null");
		a2.add(99);
		a2.add(99);
		a2.add(99);
		
		System.out.println(a2);
		Collections.sort(a2);
		System.out.println(a2);
		Enumeration E1= a2. elements();
		
		
		
//-----------------------------------------------------------------------------------------------------------------	
		System.out.println("LinkedList:---------------------------------------------------------------");

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
		//L1.add("Null");
		
		System.out.println(L1);
		
		Collections.sort(L1);
		System.out.println(L1);
//-----------------------------------------------------------------------------------------------------------------------------	
		System.out.println("TreeSet:---------------------------------------------------------------");
		 TreeSet T1=new TreeSet();
		 T1.add(31);
		 T1.add(32);
		T1.add(34);
		T1.add(36);
		T1.add(35);
		 T1.add(99);
		 T1.add(99);
		 T1.add(99);
		 //T1.add("ayaz");
		 //T1.add("Null");
		 
		 System.out.println(T1);
		//Collections.sort(T1);
//-------------------------------------------------------------------------------------------------------------------------
			System.out.println("LinkedHashSet:---------------------------------------------------------------");
			LinkedHashSet H1=new LinkedHashSet();
			H1.add(41);
			H1.add(43);
			H1.add(42);
			H1.add(44);
			H1.add(45);
			H1.add(47);
			H1.add(99);
			H1.add(99);
			H1.add(99);
			H1.add("Null");
			System.out.println(H1);
			//Collections.sort(H1);
			//System.out.println(H1);
//------------------------------------------------------------------------------------------------------------------------
			System.out.println("PriorityQueue:---------------------------------------------------------------");
			
			PriorityQueue P1=new PriorityQueue();
			P1.add(51);
			P1.add(53);
			P1.add(52);
			P1.add(54);
			P1.add(55);
			P1.add(57);
			P1.add(56);
			P1.add(99);
			P1.add(99);
			P1.add(99);
			//P1.add("Null");
			
		System.out.println(P1);
		//Collections.sort(P1);
//---------------------------------------------------------------------------------------------------------------------------
		System.out.println("HashSet:---------------------------------------------------------------");

		HashSet H2=new HashSet();
		H2.add(61);
		H2.add(63);
		H2.add(62);
		H2.add(65);
		H2.add(64);
		H2.add(67);
		H2.add(99);
		H2.add(99);
		H2.add(99);
		H2.add("Null");
		H2.add("Ayaz");
		
		System.out.println(H2);
		//Collections.sort(H2);
			
	}
}
