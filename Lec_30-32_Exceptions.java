import java.io.IOException;

class Invalid extends Exception{
	Invalid(String s){
		super(s);
	}
}
// class Test{
// }
public class Main {
	static void p(String s) throws Invalid{
		throw new Invalid("Invalid");
	}
	// void m() throws IOException{
	// 	throw new IOException("IOExcpetion");
	// }
	// void n() throws IOException{
	// 	m();
	// }
	// void p() {
	// 	try {
	// 		n();
	// 	} catch (Exception e) {
	// 		System.out.println("ExceptionHandled"); 
	// 	}
	// }
	public static void main(String[] args) {
		try {
			p("Jonny");			
		} catch (Exception e) {
			System.out.println("Handled");
		}
		// 	Main m=new Main();
		// m.p();
		// int a=30;
		// int b=0;
		// try{
		// 	try {
		// 		System.out.println(a/b);
		// 	} catch (ArithmeticException e) {
		// 		System.out.println("E:1");
		// 	}
		// 	try {
		// 		System.out.println(a/b);
		// 	} catch (ArrayIndexOutOfBoundsException e) {
		// 		System.out.println("E:2");
		// 	}
		// }
		// catch(ArithmeticException ae){
		// 	System.out.println("ArithmeticException");
		// 	System.out.println("Inside-Parent-Try-Catch-Block");
		// }
		// catch(ArrayIndexOutOfBoundsException ae){
		// 	System.out.println("IndexOutOfBoundsException");
		// 	System.out.println("Inside-Parent-Try-Catch-Block");
		// }
		// catch(Exception ae){
		// 	System.out.println("Exception");
		// 	System.out.println("Inside-Parent-Try-Catch-Block");
		// }
		// System.out.println("Next....");


		// catch(ArithmeticException ae){
		// 	System.out.println(ae.getMessage());
		// }
		// finally{
		// 	System.out.println(a/a);
		// }
	}
    
}
