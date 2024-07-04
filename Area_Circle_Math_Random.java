package java_basics;

public class Area_Circle_Math_Random 
// WAP to find area of circle using math random
{
	static double Pi_value=Math.PI;
	public static void main(String[] args)
	{
		double r= Math.random();
		double area=Pi_value*r*r;
		System.out.println(area);
	}

}
