package string.functions;

public class C26_Matches {

	public static void main(String[] args) {
		String s1="Rama";
		boolean b1=s1.matches("....");
		System.out.println(b1);
		
		String s2="Nilima";
		System.out.println(s2.matches("(.*)a"));
		System.out.println(s2.matches("N(.*)"));
		System.out.println(s2.matches("(.*)m(.*)"));
		System.out.println(s2.matches("(.*)i(.*)"));
		System.out.println(s2.matches(".i(.*)"));
		
		System.out.println(s2.matches("(.*)z(.*)"));
		System.out.println(s2.matches(".r(.*)"));

	}

}

//.indicates ->single char search
//(.*)indicates ->multi search in SQL ->%S