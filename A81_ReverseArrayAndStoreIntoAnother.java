/*WAP on reverse of Array and store into another Array using for loop*/
package string_programs;

import java.util.Arrays;

public class A81_ReverseArrayAndStoreIntoAnother {
    static int k=0;
	public static void main(String[] args) {
		int rollno[]= {11,13,15,17,19};
		int rollno_reverse[]=new int[rollno.length];
		
		for(int i=rollno_reverse.length-1;i>=0;i--)
		{
			rollno_reverse[i]=rollno[k];
			k++;
		}
		System.out.println("Old array= " +Arrays.toString(rollno));
		System.out.println("New array= " +Arrays.toString(rollno_reverse));
	}

}
