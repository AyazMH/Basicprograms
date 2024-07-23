package colletions;
//WAP for Sorting in the collection
import java.util.ArrayList;
import java.util.Collections;
public class Sorting_In_Collection 
{

	public static void main(String[] args)
	{
		ArrayList A1=new ArrayList();
		A1.add("India");
		A1.add("Australia");
		A1.add("South Africa");
		A1.add("England");
		A1.add("Newzealand");
		A1.add("SriLanka");
		
		Collections.sort(A1);
		System.out.println(A1);
		
	}

}
