import java.util.Scanner;
public class ExceptionEg{
    public static void main (String args[])
    {    int sq  = 0;
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=1; i<=num; i++)
        {
          sq+=num;  
        }
        System.out.println(sq);
        try{
            System.out.println(2/0);
            System.out.println("After Exception");
        }
        catch(ArithmeticException ae){
            System.out.println("Not Divides "+ae.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException aioube){
            System.out.println("Not in Bound "+aioube.getMessage());
        }
       // System.out.println("After Exception");//Not Possible
        finally{
            System.out.println("Finally");
        }
    }
}
