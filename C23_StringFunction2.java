/*string functions-contains()/endswith()/toCharArray()/toString()*/
package string.functions;

import java.util.Arrays;

public class C23_StringFunction2 {
	static int count_of_digit=0;
	static int count_of_alphabets=0;
	static int count_of_spaces=0;

	public static void main(String[] args) {
		String name="I am Nilima";
		boolean answer=name.contains("am");
		System.out.println(answer);
		
		boolean answer1=name.endsWith("Nilima");
		System.out.println(answer1);
		
		String s1="50000000 cent";
		char c1[]=s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(c1[10]);
		
		for(int i=0;i<s1.length();i++)
		{
		boolean b1=Character.isDigit(c1[i]);
		if(b1==true)
		{
			count_of_digit++;
		}
		}
		System.out.println("The number of digits in the given string are->" +count_of_digit);
		
		for(int i=0;i<s1.length();i++)
		{
		boolean b2=Character.isLetter(c1[i]);
		if(b2==true)
		{
			count_of_alphabets++;
		}
		}
		System.out.println("The number of alphabets in the given string are->" +count_of_alphabets);
		
		for(int i=0;i<s1.length();i++)
		{
		boolean b3=Character.isSpaceChar(c1[i]);
		if(b3==true)
		{
			count_of_spaces++;
		}
		}
		System.out.println("The number of spaces in the given string are->" +count_of_spaces);
	
	}

}
