/*WAP to remove 'A' letter in your name */
package string_programs;

public class A82_RemoveA {

	public static void main(String[] args) {
		String name="Anamika";
		System.out.println(name.replaceAll("A", ""));
		
		System.out.println(name.replaceAll("a", ""));
	}

}
