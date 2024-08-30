/*WAP to use String class length(), touppercase & tolowercase */
package string_programs;

public class A65_StringFunction1 {

	public static void main(String[] args) {
	String name="Happy Thoughts Foundation";
	
	int len=name.length();
	System.out.println(len);
	
	String caps=name.toUpperCase();
	System.out.println(caps);
	
	String small=name.toLowerCase();
	System.out.println(small);
	}

}
