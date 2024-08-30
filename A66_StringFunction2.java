/*WAP using charAt, indexofchar, trim, substring-single and double*/
package string_programs;

public class A66_StringFunction2 {

	public static void main(String[] args) {
		String name="Happy Thoughts Foundation";
		
		char c=name.charAt(10);
		System.out.println(c);
		
		int i1=name.indexOf('h');
		System.out.println(i1);
		
		String str="   Wish you happy birthday   ";
		System.out.println(str.trim());
		
		String str1="Good Morning";
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(5, 9));
	}
}
