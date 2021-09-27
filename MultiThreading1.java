//MultiThreading.java


public class MultiThreading extends Thread{
    public void run(){
        System.out.println("Run Block is Running");
        for(int i=0;i<=5;i++){
            System.out.print(i);
        }
    }
}

//Main.java

public class Main {
    public static void main(String[] args) {
        MultiThreading MT1=new MultiThreading();
        MT1.start();  //Used when every thread is executed
        MultiThreading MT2=new MultiThreading();
        MT2.start();
        //!!Important!!
        /*
        My question is why do these threads print in a seemingly random order
        each time? I know threads execute concurrently but would t1 not always
        finish before t2 due to the sequential execution of the main process?

Answer: Calling start() on a Thread doesn't necessarily result in the thread 
        running immediately after. It is possible for other things to happen
        in between your calling start() and the first line of your thread's 
        run() method actually being run. And even once your run() is actually
        running, it's also possible that other things happen before, during,
        or after your run() method finishes.
        
        */
       
      
     //OUTPUTS:
      //  Produces Random Output.
    }
}
