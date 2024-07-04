package java_basics;

public class String_Function
{

	public static void main(String[] args) 
	{
		String a="Ayaz Mohammed Hannef";
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.charAt(7));
		//System.out.println(a.replace(18, 19));
		
		//String b=a.toLowerCase();
		//System.out.println(b);
		String c="bangalore is the capital of karanataka";
		String c1=c.toUpperCase();
		System.out.println(c1);
		String c2=c.toLowerCase();
		System.out.println(c2);
		int c3=c.length();
		System.out.println(c3);
		int c4=c.indexOf('c');
		System.out.println(c4);
		
		
	}

}
