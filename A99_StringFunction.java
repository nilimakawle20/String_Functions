/*WAP with split(string regex) & split(string regex, int index)*/
package string_programs;

public class A99_StringFunction {

	public static void main(String[] args) {
		String s2="I am learning online automation testing";
		String s3[]=s2.split(" ");
		//s3[0]=I;
		//s3[1]=am;
		//s3[2]=learning;
		//s3[3]=online;
		//s3[4]=automation;
		//s3[5]=testing;
		System.out.println(s3[2]);

	}

}
