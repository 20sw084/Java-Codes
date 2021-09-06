//First.java

public class First{
   // protected String num;
   // protected int age;
   // public First(){
   //    num="Jonny";
   //   age=18;
   // }
    public void print(){
        System.out.println("First Class.");
    } 
}

//Second.java


public class Second extends First{
 //   protected String num;
    
   // public Second(){
   //     super();
   //     num="Junaid";
    //   super.num="Rajput";
   // }
    public void print(){
        System.out.println("Second Class.");
        //super.print();
    }    
}

//Test.java


public class Test{
  public static void main(String[] args) {
    First f1=new First();
    Second s1=new Second();
        First common=f1;
        /*
        * Second common=f1;   //Not Possible due to Dynamic methid dispatching.
                              //MeanWhile, child class didnt provide reference to parent class.
        */
        common.print();
        common = s1;
        common.print();
    //System.out.println("First num is  "+ f1.print());
  //  System.out.println("Second num is  ");
  //s1.print();
  }
}
