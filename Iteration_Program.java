package colletions;
//WAP to make use of Iteration with each and every elements of the ArrayList
import java.util.ArrayList;
import java.util.Iterator;

public class Iteration_Program
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
			
			Iterator I1=A1.iterator();// ------------------> Iterator Method after adding this we need import 
			
			while(I1.hasNext()) //---------> True if the iteration has more elements and False if the iteration has no elements 
			{
				System.out.println(I1.next());     //---------> Returns the next element in the iteration(next method )
			}
							
	}

}
