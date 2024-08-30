/*WAP to reverse a string value*/
package string_programs;

public class A67_ReverseString {

	public static void main(String[] args) {
		String name="radhika";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char c=name.charAt(i);
			rev=rev+c;
		}
		System.out.println(rev);
	}

}
