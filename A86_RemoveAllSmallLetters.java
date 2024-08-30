/*WAP to remove all smaller letters in a given string */
package string_programs;

public class A86_RemoveAllSmallLetters {
	public static void main(String[] args) {
	String s1="PaSSion";
	System.out.println(s1.replaceAll("[a-z]", ""));
}
}
