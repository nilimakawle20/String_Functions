/*WAP to convert any String into array*/
package string_programs;

import java.util.Arrays;

public class A100_ConvertingStringtoArray {

	public static void main(String[] args) {
		String s2="I am learning online automation testing";
		String s3[]=s2.split(" ");
		System.out.println(Arrays.toString(s3));
	}

}
