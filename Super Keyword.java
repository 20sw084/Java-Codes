//First.java

public class First{
    final int num=10;
    public First(){
        System.out.println("First Constructor Called.");
    }
}

//Second.java

public class Second extends First{
    public Second(){
        super();
        System.out.println("Second Constructor Called.");
    }
}

//Test.java

public class Test{
  public static void main(String[] args) {
    First f1;//=new First();
    Second s1;//=new Second();
    f1=new Second();   //Okay, No Error
    //s1=new First();   //Error, cannot convert from Child to Parent, / didnt give reference to Parent
  }
}
