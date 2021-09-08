import java.util.Scanner;
public class UseScanner {
    public static void main(String[] args) {     
    Scanner input=new Scanner(System.in);
    //Provide Integer
    System.out.println("Enter an Integer");
    int intVar=input.nextInt();
    ///Provide Sh
    System.out.println("Enter a Short");
    short shortVar=input.nextShort();
    ///Provide Long
    System.out.println("Enter a Long");
    long longVar=input.nextLong();
    ///Provide Double
    System.out.println("Enter a Double");
    double doubleVar=input.nextDouble();    
    //Provide Float
    System.out.println("Enter a Float");
    Float floatVar=input.nextFloat();
    //Provide Character
    System.out.println("Enter a Character");
    char charVar=input.next().charAt(0);
    //Provide String
    System.out.println("Enter a String");
    String stringVar=input.next();
    //Provide Boolean
    System.out.println("Enter a Bool");
    Boolean boolVar=input.nextBoolean();
    //Print Values
    System.out.println("Integer is "+intVar);
    System.out.println("Short is "+shortVar);
    System.out.println("Long is "+longVar);
    System.out.println("Double is "+doubleVar);
    System.out.println("Float is "+floatVar);
    System.out.println("Character is "+charVar);
    System.out.println("String is "+stringVar);
    System.out.println("Boolean is "+boolVar);
}
}