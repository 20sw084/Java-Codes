class Area{
double length;
double breadth;
public void setDimensions(double l,double b){length=l;breadth=b;}
public double getArea(){double Area=length*breadth;return Area;}
}
//Main.java:
import java.util.Scanner;
class Main{public static void main(String[] args) {
Area A1=new Area();
Scanner Scan=new Scanner(System.in);
System.out.println("Enter Length of Rectangle.");
double len=Scan.nextDouble();
System.out.println("Enter Breadth of Rectangle.");
double bred=Scan.nextDouble();
A1.setDimensions(len,bred);
System.out.println("Area of Rectangle is: "+A1.getArea());}
}
