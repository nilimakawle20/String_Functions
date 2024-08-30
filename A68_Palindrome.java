/*WAP to check if the given string is palindrome*/
package string_programs;

public class A68_Palindrome {

	public static void main(String[] args) {
		String name="sahas";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char c=name.charAt(i);
			rev=rev+c;
		}
		System.out.println(rev);
		
		boolean result=name.equals(rev);
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
