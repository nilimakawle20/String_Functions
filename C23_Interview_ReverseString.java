package string.functions;

public class C23_Interview_ReverseString {

	public static void main(String[] args) {
		String name="My name is Nilima";
		String input=name.toLowerCase();
		String reverse="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			reverse=reverse+c1;
			//System.out.println(reverse);

		}
		System.out.println(reverse);

	}

}
