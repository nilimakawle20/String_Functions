/*WAP to send 5 int value from scanner class in the Array*/
package string_programs;
import java.util.Arrays;
import java.util.Scanner;

public class A70_ScannerArray {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int emp_id[]=new int[5];
		System.out.println("Please enter employee ids of 5 persons");
		for(int i=0;i<emp_id.length;i++)
		{
			emp_id[i]=s.nextInt();
		}
		System.out.println("Employee ids entered through scanner class: " +Arrays.toString(emp_id));
	}

}
