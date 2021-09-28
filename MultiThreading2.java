//MultiThreading.java

public class MultiThreading extends Thread{
    public void run(){
        System.out.println("Run Block is Running");
        show();
    }
    public synchronized static void show(){
        for(int i=0;i<=5;i++){
           System.out.print(i);
        }
        System.out.println();
    }
}

//Main.java

public class Main {
    public static void main(String[] args) {
        MultiThreading MT1=new MultiThreading();
        MT1.start();  //Used when every thread is executed
        MultiThreading MT2=new MultiThreading();
        MT2.start();
      }
}
