package string.functions;
;
public class C22StringFunction {

	public static void main(String[] args) {
		String name="ramu";
		int length_of_string=name.length();
		System.out.println(length_of_string);
		//touppercase - convert string to upper case
		//tolowercase - convert string to lower case
		
		String a1=name.toUpperCase();
		System.out.println(a1);
		String a2="MY NAME IS NILIMA";
		System.out.println(a2);
		int length=a2.length(); //gives length of string including spaces
		System.out.println(length);
		String a3=a2.toLowerCase();
		System.out.println(a3);
	}

}
