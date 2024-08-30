/*Check if given string is palindrome or not*/
package string.functions;

public class C23_Palindrome {

	public static void main(String[] args) {
		String name="Rotator";
		String input=name.toLowerCase(); //always covert either caps/lower case
		String reverse="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			reverse=reverse+c1;
			//System.out.println(reverse);

		}
		System.out.println(reverse);
		
		boolean result=input.equals(reverse);
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("Given string is palindrome");
		}
		else 
		{
			System.out.println("Given string is not palindrome");
		}

	}

}
