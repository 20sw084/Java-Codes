import java.util.Scanner;
public class UseArray{
    public static int[] populateArray() {
        int[] arr=new int[20];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static void printarr(int[] arr){
    int even=0;
    int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else {
                odd++;                
            }
        }
        System.out.println("Even Numbers are "+even);
        System.out.println("Odd Numbers are "+odd);
    }
    public static void main(String[] a) {
        System.out.println("Enter 20 Numbers.");
        int[] array=populateArray();
        printarr(array);
    }
}