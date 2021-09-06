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
}

//Test.java

public class Test{
  public static void main(String[] args) {
    First f1=new First();
    Second s1=new Second();
    System.out.println("Second num is  ");
  s1.print();
  }
}
