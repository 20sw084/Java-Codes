package example;

public class Largest_Element_in_Array {
	public static void main(String Args[]) {
		int[] My_Array= new int[]{21,12,22,20,19};
		int Large=My_Array[0];
		for(int i=0;i<My_Array.length;i++) {
			if(Large<My_Array[i]) {
				Large=My_Array[i];
			}
		}	System.out.println("\nLargest Element in Array is: "+Large);	
	}
}
