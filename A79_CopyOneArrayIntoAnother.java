/*WAP on copy of one array into another array using iteration*/
package string_programs;

import java.util.Arrays;

public class A79_CopyOneArrayIntoAnother {

	public static void main(String[] args) {
		
		int arr[]= {13,23,45,35,67};
		int arr_copied[]=new int[arr.length];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr_copied[i]=arr[i];
		}
		System.out.println("Old array: " +Arrays.toString(arr));
		System.out.println("New copied array: " +Arrays.toString(arr_copied));
	}

}
