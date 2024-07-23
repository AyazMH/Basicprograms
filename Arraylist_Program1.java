package colletions;

import java.util.ArrayList;

public class Arraylist_Program1 
{

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Rohit");
		a1.add("Pant");
		a1.add("Jaiswal");
		a1.add("Siraj");
		a1.add("Arshadeep");
		
		int I1=a1.indexOf("Siraj"); //---> To find the indexOf Array list
		System.out.println("Index of the given Array list is :- " +I1);
		
		a1.get(4); // ----> Using the get method
		System.out.println(a1.get(4));
		
		a1.set(3, "Rahul"); //--------> Using the set method 
		System.out.println(a1);
	}

}
