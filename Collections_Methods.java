package colletions;
import java.util.ArrayList;
public class Collections_Methods 
{

	public static void main(String[] args)
	{
//-------------------------------------------add(object)------------------------------------------------------------------------
			ArrayList a1=new ArrayList();
			a1.add("Rohit");
			a1.add("Pant");
			a1.add("Jaiswal");
			a1.add("Siraj");
			a1.add("Arshadeep");
			a1.add(32);
			a1.add('A');
			System.out.println(a1);
//-----------------------------------------addAll(Collection)-----------------------------------------------------------------------		
			ArrayList a2=new ArrayList();
			a2.addAll(a1);
			a2.add("Ayaz");
			a2.add("Siddiq");
			System.out.println(a2);
//-------------------------------------------Contains(object)-------------------------------------------------------------------------
			boolean b=a2.contains("Aaz");
			System.out.println(b);
//--------------------------------------------Contains all(Collection)----------------------------------------------------------------

			boolean b1=a2.containsAll(a1); //----> checking in a2 entire a1 is present or not 
			System.out.println(b1);
//---------------------------------------------Is empty------------------------------------------------------------------------
			boolean b2=a1.isEmpty();
			System.out.println(b2);
			ArrayList a3=new ArrayList();
			boolean b3=a3.isEmpty();
			System.out.println(b3);
//----------------------------------------------remove(Object)------------------------------------------------------------	
			ArrayList a4=new ArrayList();
			a4.add("Rohit");
			a4.add("Pant");
			a4.add("Jaiswal");
			a4.add("Siraj");
			a4.add("Arshadeep");
			System.out.println("Before Removal -->" +a4);
			a4.remove("Jaiswal");
			System.out.println("Aftter Removal -->" +a4);
//------------------------------------------------Remove All(collection)----------------------------------------------------------------
			
			ArrayList a5=new ArrayList();
			a5.addAll(a4);
			a5.add("Yuvi");
			a5.add(36);
			a5.removeAll(a4);
			System.out.println(a5);
//-------------------------------------------------Size-------------------------------------------------------------------------------
			ArrayList a6=new ArrayList();
			a6.addAll(a4);
			a6.add("Yuvi");
			a6.add(36);
			a6.size();
			System.out.println(a6.size());
//-----------------------------------------------Clear-----------------------------------------------------------------------------------------
			ArrayList a7=new ArrayList();
			a7.add(45);
			a7.add(46);
			a7.add(47);
			a7.add(48);
			a7.add("Yuvi");
			a7.add(36);
			System.out.println("Before clear --> "+a7);
			a7.clear();
			System.out.println("After clear --> "+a7);
			
	}

}
