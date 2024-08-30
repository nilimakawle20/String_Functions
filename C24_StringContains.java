package string.functions;

import java.util.Arrays;

public class C24_StringContains {
	static int count_of_digits=0;
	static int count_of_alphabets=0;
	static int count_of_spaces=0;
	static int count_of_specialchar;
	
	public static void main(String[] args) {
	String name="I am Nilima";
	boolean answer=name.contains("am"); //contains will have to pass char sequence, string contains
	//System.out.println(answer);
	
	boolean answer1=name.endsWith("Nilima"); //ends with string
	//System.out.println(answer1);
	
	String s1="My password is Neelk@@*20";   
	char c1[]=s1.toCharArray();
	//System.out.println(Arrays.toString(c1)); //use toString char[]
	//System.out.println(c1[2]);
	
	 //check if given string having how many numerics present?
	
	for(int i=0;i<s1.length();i++)
	{
	boolean b1=Character.isDigit(c1[i]);
	//System.out.println(b1);
	if(b1==true)
	{
		count_of_digits++;
	}
	
	//check if given string having how many alphabets present?
	
	boolean b2=Character.isLetter(c1[i]);
	//System.out.println(b2);
		if(b2==true)
		{
			count_of_alphabets++;
		}
		
	//check if given string having how many alphabets present?
		
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
	
	//check if given string having how many special characters present?
	System.out.println("Length of whole string: "+s1.length());
	count_of_specialchar=s1.length()-count_of_digits-count_of_alphabets-count_of_spaces;
	System.out.println("Number of special characters present in given string : "+count_of_specialchar);
	}
}


//=  assignment
//== equals to -returns boolean
//s1.equals(s2) -returns boolean
//Arrays.equals -returns boolean