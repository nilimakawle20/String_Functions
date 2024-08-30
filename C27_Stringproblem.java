package string.functions;

import java.util.Arrays;

public class C27_Stringproblem {

	public static void main(String[] args) {
		String name="Ram";
		System.out.println(name.repeat(5));//repeat function will not work with JRE below 11 and give undefined for type string
           
		String name1="Siya";
		System.out.println(name1.indexOf("y")); //string follow indexing
		
		String namearr[]= {"Riya","Diya","Jiya","Nia"};
		System.out.println(namearr[1]); //array follow indexing
		
		String name2="Jija";
		name2="Akhila";
		System.out.println(name2); //updating value of string

		
		int rollno[]=new int[3];
		rollno[0]=90;
		rollno[0]=70;
		rollno[1]=60;
		rollno[2]=50;
		System.out.println(rollno[0]); //updating value of array
		
		System.out.println(Arrays.toString(rollno));
		
		System.out.println("===============================");
		System.out.println("Below example of string exception ");
		
		String q="Manish";
		for(int i=0;i<q.length()+2;i++)
		{
			System.out.println(q.charAt(i));
		}
		
	}

}
