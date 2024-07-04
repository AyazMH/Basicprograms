package java_basics;

public class Global_variable_Deafault_Value
//WAP on Global variable default value
{
	int a;
	byte b;
	static short c;
	static long d;
	static double e;
	static float f;
	static boolean g;
	static char h;
	public static void main(String[] args)
	{
		System.out.println("Global variable default value are");
		Global_variable_Deafault_Value a1=new Global_variable_Deafault_Value();
		System.out.println("int - " +a1.a);
		Global_variable_Deafault_Value b1=new Global_variable_Deafault_Value();
		System.out.println("byte - " +b1.b);
		System.out.println("short - " +c);
		System.out.println("long - " +d);
		System.out.println("double - "+e);
		System.out.println("float - "+f);
		System.out.println("Boolean - "+g);
		System.out.println("char - "+h);
	}

}
