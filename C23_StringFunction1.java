package string.functions;

public class C23_StringFunction1 {

	public static void main(String[] args) {
		String a="I love my India";
		char first_char=a.charAt(11); //charAt(index)-gives position of character at index and index count starts from 0
		System.out.println(first_char);
		
		int i1=a.indexOf('m'); //indexOf(Char)-gives character present at index position
		System.out.println(i1);
		
		String trimmed=a.trim(); //trim-removes space from start and end of string but not in middle of string
		System.out.println(trimmed);
		String b="    Hello Shama, how are you       ";
		System.out.println(b);
		System.out.println(b.trim());
		
		String c="Hello Abhishek";
		String c1=c.substring(4); //single para substring[substring(int beginIndex)-gives result from mentioned index to end of string
		System.out.println(c1);
		String c2=c.substring(3, 9);//double para substring[substring(int beginIndex,int endIndex)-gives result from mentioned start index to (end index-1) of string
		System.out.println(c2);
		
		String input="Manish Kumar Tiwari";
		String s1=input.substring(7, 12);
		System.out.println(s1);
	}

}
