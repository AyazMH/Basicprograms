package java_basics;
import java.util.Scanner;
public class Scanner_basic 
//Scanner class basic
{
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
			int	a= s1.nextInt();
			System.out.println(a);
			byte b=s1.nextByte();
			System.out.println(b);
			short c=s1.nextShort();
			System.out.println(c);
			long d=s1.nextLong();
			System.out.println(d);
			String name=s1.next();
			System.out.println(name);
			float e=s1.nextFloat();
			System.out.println(e);
			double f= s1.nextDouble();
			System.out.println(f);
			boolean g=s1.nextBoolean();
			System.out.println(g);	
	}

}
