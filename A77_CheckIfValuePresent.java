/*Check number 15 is present in given array of size 5, int datatype*/
package string_programs;

public class A77_CheckIfValuePresent {
static int no_to_check=15;
	public static void main(String[] args) 
	{
		
		int rollno[]= {12,15,78,34,20};
		for(int i=0;i<rollno.length;i++)
		{
			if(no_to_check==rollno[i])
			{
				System.out.println("Number 15 is present in given array of size 5");
			}
		}
		

	}

}