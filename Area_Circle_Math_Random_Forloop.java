package java_basics;

public class Area_Circle_Math_Random_Forloop 
//WAP to find area of circle 5 times using Math.random and For loop
{
	static double Pi_value= Math.PI;
	
	public static void main(String[] args) 
	{
		System.out.println("Area of circle 5 times ");
		for(int i=1;i<=5;i++)
		{
			double r= Math.random();
			double area=Pi_value*r*r;
			System.out.println(area);
		}
		
	}

}
