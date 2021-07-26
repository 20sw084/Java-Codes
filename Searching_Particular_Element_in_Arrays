package example;
import java.util.Scanner;
public class Searching_Particular_Element_in_Arrays {
	
	public static void main(String Args[]) {
		
		int[] My_Array= new int[]{21,12,22,20,19};
		System.out.println("Enter Number to Search");
		Scanner Input=new Scanner(System.in);
		int input_int=Input.nextInt();
		int Found=0,Position = 0;
		for(int i=0;i<My_Array.length;i++) {
			if(My_Array[i]==input_int) { Found=1;Position=i;break;}
			else
				Found=0;
		}
		if(Found==0) { 
			System.out.println("Value is not Found");
		}
		else
			System.out.println("Found "+input_int+" at Position "+(Position+1));
	}
}
