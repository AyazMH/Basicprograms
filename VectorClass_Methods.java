package colletions;
//WAP On VectorClass using Vector Methods
import java.util.Vector;

public class VectorClass_Methods
{

	public static void main(String[] args)
	{
			Vector V1=new Vector();
			V1.add(11);
			V1.add(22);
			V1.add(33);
			V1.add(44);
			V1.add(55);
			V1.add(66);
			V1.add(77);
			V1.add("Null");
			V1.add("Ayaz");
			
			V1.addElement("Kodagu");
			System.out.println(V1);
			
			V1.firstElement();
			System.out.println(V1.firstElement());
			
			V1.lastElement();
			System.out.println(V1.lastElement());
			
			V1.removeElement(66);
			System.out.println(V1);
			
			V1.removeElementAt(2);
			System.out.println(V1);
			
			V1.removeAllElements();
			System.out.println(V1);
			
			V1.capacity();
			System.out.println(V1);
		
	}

}
