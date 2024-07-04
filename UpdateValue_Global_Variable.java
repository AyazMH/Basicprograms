package java_basics;

public class UpdateValue_Global_Variable 
{
	int run=88;
	static String name="Hussey";
	
	public static void main(String[] args) 
	{
		name="Michael Hussey";
		System.out.println(name);
		UpdateValue_Global_Variable r1=new UpdateValue_Global_Variable();
		System.out.println(r1.run=96);
	}

}
