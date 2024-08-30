/*Copy one array to another array using iteration*/
package string.functions;
import java.util.Arrays;

public class C25_Copy_to_another_array {

	public static void main(String[] args)
	{
		//int no=6; execution from right to left in java
		int rollno[]=new int[5];
		
		rollno[0]=34;
		rollno[1]=45;
		rollno[2]=16;
		rollno[3]=17;
		rollno[4]=12;
	
		int rollno_copied[]=new int[rollno.length]; 
		for(int i=0;i<rollno.length;i++)
		{
			rollno_copied[i]=rollno[i];
		}
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno_copied));
	}

}
