//Lamp.java:
class Lamp{
boolean Switch;
public boolean Status(){return Switch;}
public void onLamp(){Switch=true;}public void offLamp(){Switch=false;}
}
//Main.java:
class Main{
public static void main(String[] args) {
Lamp lampobj=new Lamp();
lampobj.onLamp();S
ystem.out.println(lampobj.Status());}
}
