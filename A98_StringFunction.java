/*WAP with equalsIgnoreCase, endswith, isEmpty & Repeat in String Class*/
package string_programs;

public class A98_StringFunction {

	public static void main(String[] args) {
		String name="AaraDhya";
		System.out.println(name.equalsIgnoreCase("aaradhya"));
		
		System.out.println(name.endsWith("a"));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.repeat(10));

	}

}
