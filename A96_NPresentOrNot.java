/*WAP to check if 'n' is present in the middle of given string "automation testing" or not*/
package string_programs;

public class A96_NPresentOrNot {

	public static void main(String[] args) {
		String s1="automation testing";
		System.out.println(s1.matches("(.*)n(.*)"));
	}
}
