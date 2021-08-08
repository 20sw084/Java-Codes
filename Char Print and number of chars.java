import java.util.Scanner;
public class Count_Number_of_Chars {
	public static void main(String Args[]) {
		int ch1,ch2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Character");
		ch1=scan.next().charAt(0);
		System.out.println("Enter Second Character");
		Scanner scane=new Scanner(System.in);
		ch2=scane.next().charAt(0);
		int ch=ch2-ch1;ch--;
		System.out.println("Characters Are: ");
		for(int i=(ch1+1);i<ch2;i++)
			System.out.print(((char)i)+" ");
		System.out.println("\nTotal Characters Are: "+ch);
	}
