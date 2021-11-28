//First.java

public class First{
    protected String num;
    protected int age;
    public First(){
       num="Jonny";
       age=18;
    }
    public void print(){
        System.out.println(num);
    } 
    public void display(){
        System.out.println("First Class display.");
    } 
    public void show(){
        System.out.println("First Class show.");
    } 
}
//Second.java


public class Second extends First{
    protected String num;
    public Second(){
        super();
        num="Junaid";
        super.num="Rajput";
    }
    public void print(){
        super.print();
    } 
    public void display(){
        System.out.println("Second Class display.");
    }    
}

//Test.java


public class Test{
  public static void main(String[] args) {
    First f1=new First();
    Second s1=new Second();
    First common=s1;
     common.display();
     common.show();
  }
}
 
