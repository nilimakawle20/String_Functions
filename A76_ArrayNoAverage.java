/*Find out the average value of 4 numbers in array of int data type*/
package string_programs;

import java.util.Scanner;

public class A76_ArrayNoAverage {
       // static int sum=0;
       // static double average=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num[]=new int[4];
		num[0]=s.nextInt();
		num[1]=s.nextInt();
		num[2]=s.nextInt();
		num[3]=s.nextInt();
		
		int sum=0;
	    double average=0;
	    
		for(int i=0;i<=num.length-1;i++)
		{
			
			sum=sum+num[i];
		}
		System.out.println("Sum of 4 numbers in an array: "+sum);
		
		average=sum/num.length;
		System.out.println("Average of 4 numbers in an array: "+average);
	}

}
