package string_functions;

import java.util.Arrays;

// WAP to check the given 2 strings are Anagram
public class Anagram_program
{

	public static void main(String[] args) 
	{
		String s1="ayaz";
		String s2="zaya";
		
		if (s1.length()!=s2.length())
		{
			System.out.println("The Given 2 Strings are eligible for Anagram");
		}
		else
		{
			System.out.println("The Given 2 Strings are Not eligible for Anagram");

		}
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(c1);
		System.out.println(c2);
		
		boolean b1=Arrays.equals(c1, c2);
		if(b1==true)
		{
			System.out.println("The Given 2 Strings are Anagram ");
		}
		else
		{
			System.out.println("The Given 2 Strings are Not Anagram ");

		}
	}

}
