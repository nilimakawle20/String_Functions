/*WAP on given string to find out how many special characters present*/
package string_programs;
public class A74_HowManySpecialCharactersPresent {
		static int count_of_digits=0;
		static int count_of_alphabets=0;
		static int count_of_spaces=0;
		static int count_of_specialchar;
		
		public static void main(String[] args) {
			
		String s1="My emailid is nilimak123@yahoo.com";   
		char c1[]=s1.toCharArray();
		//System.out.println(Arrays.toString(c1)); //use toString char[]
		
		for(int i=0;i<s1.length();i++)
		{
		boolean b1=Character.isDigit(c1[i]);
		//System.out.println(b1);
		if(b1==true)
		{
			count_of_digits++;
		}
		
		boolean b2=Character.isLetter(c1[i]);
		//System.out.println(b2);
			if(b2==true)
			{
				count_of_alphabets++;
			}
			
		boolean b3=Character.isSpaceChar(c1[i]);
		//System.out.println(b3);
		if(b3==true)
		{
		count_of_spaces++;
		}
		}
		System.out.println("Number of digits present in given string : "+count_of_digits);
		System.out.println("Number of alphabets present in given string : "+count_of_alphabets);
		System.out.println("Number of spaces present in given string : "+count_of_spaces);
		
		System.out.println("Length of whole string: "+s1.length());
		count_of_specialchar=s1.length()-count_of_digits-count_of_alphabets-count_of_spaces;
		System.out.println("Number of special characters present in given string : "+count_of_specialchar);
	}

}
