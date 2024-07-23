package colletions;
//WAP on StackClass Using Stack methods
import java.util.Stack;


public class StackClass_Methods 
{

	public static void main(String[] args)
{
		Stack S1=new Stack();
		S1.add(44);
		S1.add(55);
		S1.add(66);
		S1.add(77);
		S1.add(88);
		S1.add(99);
		S1.add(00);
		S1.add(111);
		S1.add(44);
		S1.add(44);
		S1.add("Null");
		S1.add("Ayaz");
		
		System.out.println(S1);
		
		S1.pop();
		System.out.println(S1);
		
		S1.peek();
		System.out.println(S1);
		
		S1.push("Ayaz");
		System.out.println(S1);

		
		
		
		
}

}
