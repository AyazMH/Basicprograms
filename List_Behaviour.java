package colletions;
import java.util.ArrayList;
import java.util.List;

public class List_Behaviour 
{

	public static void main(String[] args) 
	{
			List L1=new ArrayList();    // ------> UpCasting ArrayList to List
			System.out.println("Indexing :-");
			L1.add(88);
			L1.add(99);
			L1.add(77);
			L1.add(55);
			L1.add(44);
			System.out.println(L1);
			System.out.println("Duplicate Value :-");
			L1.add(88);
			L1.add(88);
			L1.add(88);
			System.out.println(L1);
			System.out.println("Null Value :-");
			L1.add("Null");
			L1.add("Null");
			System.out.println(L1);	
	}

}
