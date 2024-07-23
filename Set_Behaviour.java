package colletions;
import java.util.TreeSet;
import java.util.Set;


public class Set_Behaviour
{

	public static void main(String[] args) 
	{
			Set S1=new TreeSet();   // ------> UpCasting TreeSet to Set
			System.out.println("Indexing :-");
			S1.add(66);
			S1.add(00);
			S1.add(22);
			S1.add(11);
			S1.add(33);
			System.out.println(S1);
			System.out.println("Duplicate Value :-");
			S1.add(22);
			S1.add(22);
			S1.add(22);
			System.out.println(S1);
			System.out.println("Null Value :-");
			S1.add("Null");
			S1.add("Null");
			System.out.println(S1);	
	}

}
