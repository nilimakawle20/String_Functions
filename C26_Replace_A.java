package string.functions;

public class C26_Replace_A {
	public static void main(String[] args) {
	
	String name="Ram";
	String name1=name.replaceAll("a", "");
	System.out.println(name1);
	System.out.println(name.replaceAll("a", "r"));
	
	String s1="my name is nilima";
	System.out.println(s1.replaceAll(" ", ""));
	
	String s2="NiliMa";
	System.out.println(s2.replaceAll("[A-Z]", ""));
	System.out.println(s2.replaceAll("[a-z]", ""));
	
	String s3="Nilima Roll No. 10";
	System.out.print(s3.replaceAll("[0-9]", ""));
	}
}
