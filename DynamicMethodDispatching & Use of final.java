//ParentClass.java

public  class ParentClass {    //Use of Final restricts base classes to inherit from it
    public  void display(){     //Use of Final restricts base classes to override its methods
        System.out.println("Parent Class Display Method Invoked.");
    }
}

//DerivedClass.java

public class DerivedClass extends ParentClass {
    public void display(){
        System.out.println("Derived Class Display Method Invoked.");
    }
}

//Main.java

public class Main {
    public static void main(String[] args) {
        ParentClass P=new ParentClass();
        DerivedClass D=new DerivedClass();
        ParentClass obj;
        obj=P;
        obj.display();
        obj=D;
        obj.display();
    }
}
