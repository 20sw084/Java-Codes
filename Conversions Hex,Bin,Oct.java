package example;
import java.util.Scanner;
import java.util.*;
public class Task {
	public static void main(String Args[]) {
  System.out.println("Enter an Integer Number");
	int integer;
	Scanner input=new Scanner(System.in);
	integer=input.nextInt();
	String hex;
	String oct;
	String bin;
	bin=Integer.toBinaryString(integer);
	hex=Integer.toHexString(integer);
	oct=Integer.toOctalString(integer);
	System.out.println("Binary Conversion is:"+ bin);
	System.out.println("Hexadecimal Conversion is:"+ hex);
	System.out.println("Octal Conversion is:"+ oct);*/
	}
  }
