/*WAP to reverse an array using iteration*/
package string.functions;

import java.util.Arrays;

public class C26_ReverseArray {
	static int k=0;
	public static void main(String[] args) {
	int rollno[]= {15,87,65,44,32};
	int rollno_reverse[]=new int[rollno.length];
	for(int i=rollno.length-1;i>=0;i--)
	{
		rollno_reverse[i]=rollno[k];
		k++;
	}
	System.out.println("Old array:" +Arrays.toString(rollno));
	System.out.println("New array:" +Arrays.toString(rollno_reverse));
}
}

/*Explaination
case 1 i=4,k=0    reverse[4]=15
case 2 i=3,k=1    reverse[3]=87
case 3 i=2,k=2    reverse[2]=65
case 4 i=1,k=3    reverse[1]=44
case 5 i=0,k=4    reverse[0]=32
*/