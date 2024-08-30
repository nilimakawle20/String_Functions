package string.functions;

import java.util.Arrays;

public class C27_EqualsIgnore {

	public static void main(String[] args) {
		String s1="Nilima";
		boolean b1=s1.equalsIgnoreCase("niliMa"); //ignore string case
		System.out.println(b1);
		
		String s2="";
		boolean b2=s2.isEmpty(); //verify string is empty
		System.out.println(b2);
		
		String s3="Nilima";
		System.out.println(s3.endsWith("a"));
		System.out.println(s3.endsWith("N"));
		
		String s4="my name is ram";
		String s5[]=s4.split(" "); //split the sentence where there is space and store into it in array
		//s5[0]=my
		//s5[1]=name
		//s5[2]=is
		//s5[3]=ram
		System.out.println(s5[0]);
		
		System.out.println(Arrays.toString(s5)); //split the sentence into word-array 
		String s7="Shyam";
		System.out.println(Arrays.toString(s7.toCharArray())); //split single word and store into an array
		
        String []s6=s4.split(" ", 2);  //split the sentence where there is space and limit it to 2  and store into it in array
        System.out.println(Arrays.toString(s6));
           
        String q="Software";
        String answer=q.repeat(3);
        System.out.println(answer);
           
           
	}

}
