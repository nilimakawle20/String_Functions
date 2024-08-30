/*WAP on given string to find out how many are alphabets present*/
package string_programs;

public class A72_HowManyAlphabetsPresent {
	
		static int count_of_alphabets=0;
		
		public static void main(String[] args) {
		String s1="My emailid is nilimak123@yahoo.com";   
		char c1[]=s1.toCharArray();
		//System.out.println(Arrays.toString(c1)); //use toString char[]
		
		for(int i=0;i<s1.length();i++)
		{
		boolean b2=Character.isLetter(c1[i]);
		//System.out.println(b2);
			if(b2==true)
			{
				count_of_alphabets++;
			}
		}
		System.out.println("Number of alphabets present in given string : "+count_of_alphabets);
	}

}
