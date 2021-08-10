///////////////////////////////////////////////////////////
This.java
///////////////////////////////////////////////////////////
public class This{
    int base;
    int height;
    public  void setval(int base,int height){
        this.base=base;
        this.height=height;
    }
    public void Display(){
        System.out.println("Base is "+ base +" HEIGHT is "+ height);
    }
};

///////////////////////////////////////////////////////////
Main.java
///////////////////////////////////////////////////////////
public class Main{
  public static void main(String Args[]){
    This obj=new This();
    obj.setval(21,32);
    obj.Display();
  }
}
