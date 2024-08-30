/*WAP on how to check the given two strings is an anagram of each other*/
package string_programs;

import java.util.Arrays;
import java.util.Scanner;

public class A75_StringAnagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Given strings are not angram of each other");
		}
		else
		{
			System.out.println("Please check if given strings are anagram to each other");
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			boolean finalresult=Arrays.equals(c1, c2);
			if(finalresult==true)
			{
				System.out.println("Given 2 strings are anagram of each other");
			}
			else
			{
				System.out.println("Given 2 strings are NOT anagram of each other");
			}
			
		}
		

	}

}
