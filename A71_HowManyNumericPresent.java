/*WAP on given string to find out how many are numeric letters present*/
package string_programs;

import java.util.Arrays;

public class A71_HowManyNumericPresent {
		static int count_of_digits=0;
		
		public static void main(String[] args) {

		String s1="My emailid is nilimak123@yahoo.com";   
		char c1[]=s1.toCharArray();
		//System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<s1.length();i++)
		{
		boolean b1=Character.isDigit(c1[i]);
		//System.out.println(b1);
		if(b1==true)
		{
			count_of_digits++;
		}
		}
		System.out.println("Number of digits present in given string : "+count_of_digits);
		
	}

}
