/*Check the no 15 is present in the given array of size of 5 belonging to int datatype and if no is present find out its index*/
package string.functions;

public class C25_NumPresentOrNot {
	static int no_to_check=15;
	public static void main(String[] args) {
		
		//int rollno[]= {23,14,15,17};
		//OR
		int rollno1[]= new int[5];
		rollno1[0]= 45;
		rollno1[1]= 78;
		rollno1[2]= 15;
		rollno1[3]= 18;
		rollno1[4]= 15;
		
		for(int i=0;i<rollno1.length;i++)
		{
			if(no_to_check==rollno1[i])
			{
				System.out.println("15 is present in the given array and its index is: "+i);
			}
		}

	}

}
