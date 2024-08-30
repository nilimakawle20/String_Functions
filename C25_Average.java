/*Find out the average value of 4 nos in array of int datatype*/
package string.functions;

public class C25_Average {
	static int sum=0;
	static double average=0;

	public static void main(String[] args) {
		int no[]=new int[4];
		no[0]=11;
		no[1]=79;
		no[2]=15;
		no[3]=6;
		//no[4]=16;
		
		
		//int number[]= {11,43,67};
		//String name[]= {"Sumit","Ekta","Bhavya","Navya"};
		
		/*int sum=0;
		double average=0;*/
		 
		for(int i=0;i<no.length;i++)
		{
			sum=sum+no[i];
		}
		System.out.println("The addition of 4 numbers in array: "+sum);
		
		average=sum/no.length;
		
		System.out.println("The average of 4 numbers in array: "+average);
	}

}
