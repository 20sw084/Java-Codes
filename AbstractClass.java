//AbstractClass.java

abstract public class AbstractClass {
    int age;
    public AbstractClass(){
        System.out.println("Abstract Class Constructor.");
    }
    abstract public void calculateAge(int age);
}

//ParentClass.java

public abstract class ParentClass extends AbstractClass {   
    int age;
    public abstract void calculateAge(int age);
  /*  public  void calculateAge(int age){
       System.out.println("Parent age is "+age);
   }*/
}

//DerivedClass.java

public class DerivedClass extends ParentClass {
    int age;
    public void calculateAge(int age){
        System.out.println("Derived age is "+age);
    }
    public void display(){
        System.out.println("Derived Class Display Method Invoked.");
    }
}

//Main.java

public class Main {
    public static void main(String[] args) {
    /*  ParentClass P=new ParentClass();
      DerivedClass D=new DerivedClass();
      P.calculateAge(47);
      D.calculateAge(18);
      D.display();  */      
        DerivedClass D=new DerivedClass();
        D.calculateAge(18);        
    }
}
