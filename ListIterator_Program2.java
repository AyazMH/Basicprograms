package colletions;

import java.util.ArrayList;
import java.util.ListIterator;

// WAP for backward iteration using ListIterator for ArrayList without forward iteration and note down the error
public class ListIterator_Program2 
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
		ListIterator I1= A1.listIterator();  //-------> ListIterrator Method

		//System.out.println("Iteration in Backward Direction");

		 while(I1.hasPrevious())    //-------> Method for backward direction
		 {
			 System.out.println(I1.previous());
		 } 
		
	}

}
