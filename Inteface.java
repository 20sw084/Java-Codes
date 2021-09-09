//AnInterface.java

public interface AnInterface {
    public void display();//{
    //    System.out.println("Interface method");
    //}
}

//AnotherInterface.java

public interface AnotherInterface extends AnInterface {
    public void show();//{
   //     System.out.println("Show method implemented");
    //}
}

//Implemented.java

public class Implemented implements AnotherInterface {
    public void display(){
        System.out.println("Display Method Implemented!");
    }
    public void show(){
        System.out.println("Show Method Implemented!");
    }
}

//Main1.java

public class Main1 {
    public static void main(String[] args) {
        Implemented imp=new Implemented();
        imp.display();
        imp.show();
    }
}
