/*WAP to check (Assignment 79 cont) both arrays are equal or not*/
package string_programs;

import java.util.Arrays;

public class A80_CheckIfArrayEqualOrNot {
	
	public static void main(String[] args) {
		
		int arr[]= {10,23,56,78};
		int new_arr[]= {23,10,78,56};
		
	    Arrays.sort(arr);
		Arrays.sort(new_arr);
		 
		boolean result=Arrays.equals(arr, new_arr);
		if(result==true)
		{
		System.out.println("Both the arrays are equal");
		}
		else
		{
		System.out.println("Both the arrays are NOT equal");
		}
	}
}
