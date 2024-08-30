package string.functions;
import java.util.Arrays;
public class C23_ArrayProgram {

	public static void main(String[] args) {
		
		int rollno[]=new int[5];
		rollno[0]=32;
		rollno[1]=42;
		rollno[2]=52;
		rollno[3]=62;
		rollno[4]=72;
	/*for(int i=0;i<=4;i++)
	{
		System.out.println(rollno[i]);
	}*/
	System.out.println(Arrays.toString(rollno)); //storing values in object array.
	
	String name[]=new String[4];
	name[0]="Radha";
	name[1]="Shyam";
	name[2]="Siya";
	name[3]="Ram";
	System.out.println(Arrays.toString(name)); 
}
}