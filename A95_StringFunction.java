/*Write down the difference between Equals,Contains & Matches(String functions)*/
package string_programs;

public class A95_StringFunction {

	public static void main(String[] args) {
		String a1="Wow";
		String str=a1.toLowerCase();
		System.out.println(str);
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char c1=str.charAt(i);
			reverse=reverse+c1;
		}
		System.out.println(reverse);
		
		boolean result1=str.equals(reverse);
		System.out.println(result1);
		System.out.println("This was example of equals string function");
		System.out.println("===========================================");
		
		String a2="I have been shifted to Mumbai";
		boolean result2=a2.contains("shifted");
		System.out.println(result2);
		System.out.println("This was example of contains string function");
		System.out.println("===========================================");
		
		String a3="Vidisha";
		boolean result3=a3.matches(".......");
		System.out.println(result3);
		System.out.println(a3.matches("(.*)a"));
		System.out.println(a3.matches("V(.*)"));
		System.out.println(a3.matches("(.*)s(.*)"));
		System.out.println(a3.matches("(.*)d(.*)"));
		System.out.println(a3.matches(".i(.*)"));
		
		System.out.println("This was example of matches string function");
		System.out.println("===========================================");


	}

}
