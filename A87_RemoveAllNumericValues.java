/*WAP to remove all numeric values in a given string */
package string_programs;

public class A87_RemoveAllNumericValues {

	public static void main(String[] args) {
		String s2="Vehicle No MH3246";
		System.out.println(s2.replaceAll("[0-9]", ""));
	}

}
