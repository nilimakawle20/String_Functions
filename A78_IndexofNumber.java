 /*WAP on if number 15 is present, find out its indexing*/
 package string_programs;

import java.util.Scanner;

public class A78_IndexofNumber {

	public static void main(String[] args) {
		int no_to_check=15;
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			if(no_to_check==s.nextInt())
			{
				System.out.println("Number 15 present in given array at index: "+i);
			}
		}
	

	}

}
