package string_functions;

public class Remove_A 
{
	public static void main(String[] args)
	{
			String name="Maxwell";
			String name1	= name.replaceAll("a", ""); //------> Remove any letter form the given string
			System.out.println(name1);
//----------------------------------------------------------------------------------------------------------------
			String name2=name.replaceAll("a", "e");  // --------> Replace any letter 
			System.out.println(name2); 
//----------------------------------------------------------------------------------------------------------------
			String S1="Coorg is the Kashmir of Karnataka";
			String S2=S1.replaceAll(" ", ""); //--------> To remove the space in given string
			System.out.println(S2);
//----------------------------------------------------------------------------------------------------------------
			String S3="saCHin";
			String S4=S3.replaceAll("[A-Z]", ""); //----------> To remove the capital letters
			System.out.println(S4);
//-----------------------------------------------------------------------------------------------------------------
			String S5="LonDOn";
			String S6=S5.replaceAll("[a-z]", ""); //----------> To remove the Small letters
			System.out.println(S6);
//------------------------------------------------------------------------------------------------------------------
			String S7="ayazmh024@gmail.com";
			String S8=S7.replaceAll("[0-9]", ""); //----------> To remove the Numbers
			System.out.println(S8);
//-------------------------------------------------------------------------------------------------------------------
			String S9="ayazmh";
			boolean b1=S9.matches("......");     //----------> T0 Check the Exact number of letters 
			System.out.println(b1);
//-------------------------------------------------------------------------------------------------------------------
			String S10="india";
			boolean b2=S10.matches("(.*)a");     //----------> T0 Check the string Ends with 'a'
			System.out.println(b2);
//-------------------------------------------------------------------------------------------------------------------
			String S11="karanataka";
			boolean b3=S11.matches("k(.*)");     //----------> T0 Check the string Starts with 'k' 
			System.out.println(b3);
//--------------------------------------------------------------------------------------------------------------------
			String S12="mumbai";
			boolean b4=S12.matches("(.*)m(.*)");     //----------> T0 Check the 'm' is present in the string or not 
			System.out.println(b4);
//--------------------------------------------------------------------------------------------------------------------
			String S13="mumbai";
			boolean b5=S13.matches(".u(.*)");     //----------> T0 Check the 'u' is present @ second position/place
			System.out.println(b5);
//----------------------------------------------------------------------------------------------------------------------
			String S14="sumbah";
			boolean b6=S14.matches("s....h");     //----------> T0 Check the string starts with s and ends with h and have 4 letters in b/w
			System.out.println(b6);
//-----------------------------------------------------------------------------------------------------------------------
			String S15="automation testing";
			//int a=S15.length();   //----------> 
			int a1=S15.length()/2;
			char a=S15.charAt(a1);
			System.out.println(a);
			boolean b =S15.matches("........n.........");
			System.out.println(b);
			
	}
}
