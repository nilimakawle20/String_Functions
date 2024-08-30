/*Program to reverse a string but do not follow this approach in interview*/
 /*Output of charAt is char and for string input for this program, output is not string but char which is rubbish*/

package string.functions;

public class C23_String_forloop {

	public static void main(String[] args) {
		String name="Abhishek";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		
	}

}
