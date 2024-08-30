/*WAP on given string to find out how many space numeric present*/
package string_programs;
public class A73_HowManySpaceNumericPresent {
        static int count_of_spaces=0;
		
		public static void main(String[] args) {
		String s1="My emailid is nilimak123@yahoo.com";   
		char c1[]=s1.toCharArray();
		//System.out.println(Arrays.toString(c1)); //use toString char[]
		
		for(int i=0;i<s1.length();i++)
		{
		boolean b3=Character.isSpaceChar(c1[i]);
		//System.out.println(b3);
		if(b3==true)
		{
		count_of_spaces++;
		}
		
		}
		System.out.println("Number of spaces present in given string : "+count_of_spaces);
	}

}
