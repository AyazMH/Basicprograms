package colletions;
// WAP for Iteration with each and every elements of the ArrayList in backward and forward direction using ListIterator

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterrator_Program
{

	public static void main(String[] args) 
	{
		ArrayList A1=new ArrayList();
		A1.add("Ayaz");
		A1.add("Ishana");
		A1.add("Siddiq");
		A1.add("Asif");
		A1.add("Afeel");
		A1.add(null);
		
		System.out.println(A1);
		
		System.out.println("Iteration in Forward Direction");
		ListIterator I1= A1.listIterator();  //-------> ListIterrator Method
		 
		while(I1.hasNext())    //-------> Method for forward direction
		 {
			System.out.println(I1.next());
		 }
		 
			System.out.println("Iteration in Backward Direction");

		 while(I1.hasPrevious())    //-------> Method for backward direction
		 {
			 System.out.println(I1.previous());
		 } 
	}

}
