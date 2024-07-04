package java_basics;

public class Local_Global_Variable 
{
	int age=30;
	static double salary=85000.45;
			
			
	public static void main(String[] args) 
	{
		System.out.println(salary); 
		Local_Global_Variable v1=new Local_Global_Variable();
		System.out.println(v1.age);
	}

}
