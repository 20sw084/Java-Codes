//Student.java

public class Student{
  private String name;
  private int  age;
  private String address;
  public Student(){
      name="Not-Set";
      age=0;
      address="Not-Available";
  }
  public void setInfo(String name,int age){
    this.name=name;
    this.age=age;
  }
   public void setInfo(String name,int age,String address){
    //this(name,age);
    this.name=name;
    this.age=age;
    this.address=address;
  }
  public void getInfo(){
      System.out.println("Name is "+name+" Age is "+age+ " Address is "+address);
  }
}

//Main.java

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Student[] S1;
	    S1=new Student[10];
	    for(int i=0;i<S1.length;i++){
	       S1[i]=new Student();
	    }
	   for(int i=0;i<S1.length;i++){
	       System.out.println("Person "+(i+1));
	       Scanner Scan1=new Scanner(System.in);
	       String name=Scan1.nextLine();
	       int age=Scan1.nextInt();
	       Scanner Scan2=new Scanner(System.in);
	       String address=Scan2.nextLine();
	       S1[i].setInfo(name,age,address);
	   }
	   for(int i=0;i<S1.length;i++){
	       S1[i].getInfo();
	   }
	}
}
