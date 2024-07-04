package java_basics;

public class Math_program 
//WAP Different types of math exact methods 
{
	public static void main(String[] args) 
	{
		double pivalue= Math.PI;
		System.out.println("pivalue is " +pivalue);
		
		
		
		System.out.println(Math.addExact(200, 300));
		System.out.println(Math.subtractExact(799,455));
		System.out.println(Math.divideExact(4556, 56));
		System.out.println(Math.multiplyExact(45, 66));
		System.out.println(Math.max(800, 587));
		System.out.println(Math.min(699, 565));
		System.out.println(Math.sqrt(555.68764));
		System.out.println(Math.log(56));
		System.out.println(Math.decrementExact(9876));
		

	}

}
