package java_basics;

public class NON_StaticMethod_without_Para 
// WAP Calling non static method with and without Paramtr
{
		 void state()
		 {
			 System.out.println("KARNATAKA");
		 }
		 void district()
		 {
			 System.out.println("KODAGU");
		 }
		 void Taluq()
		 {
			 System.out.println("MADIKERI");
		 }
		 void staterank(int a)
		 {
			 System.out.println("KARNATAKA RANK is "+a);
		 }
		 void districthead(String b)
		 {
			 System.out.println("KODAGU HEEAD is "+b);
		 }
		 void Taluqpopulation(int c)
		 {
			 System.out.println("MADIKERI POPULATION is"+c);
		 }
	public static void main(String[] args) 
	{
		System.out.println("Non Static method without parameter");
		NON_StaticMethod_without_Para n1=new NON_StaticMethod_without_Para ();
				n1.state();
				n1.district();
				n1.Taluq();
		System.out.println("Non Static method with parameter");
		NON_StaticMethod_without_Para n2=new NON_StaticMethod_without_Para ();
				n2.staterank(1);
				n2.districthead("MERCARA");
				n2.Taluqpopulation(2250000);
	}

}
