//MultiThreading.java

public class MultiThreading implements Runnable{
    @Override
    public void run(){
        try{
            Thread.sleep(2000);
            System.out.println("Run Method");
        }
        catch(InterruptedException ie){
            ie.getStackTrace();
        }
        System.out.println("Run Block is Ends here. "+Thread.currentThread().getName());
    }
    public void show() throws InterruptedException{
        Thread.sleep(-2122);
    }
}

//Main.java

public class Main {
    public static void main(String[] args) {
        Thread MT1=new Thread("MT1");
        Thread MT2=new Thread(new MultiThreading());
        Thread MT3=new Thread(new MultiThreading(),"MT3");
        MT1.start();  //Used when every thread is executed
        MT1.setPriority(Thread.MIN_PRIORITY);
        MT2.start();
        MT2.setPriority(Thread.MAX_PRIORITY);
        MT3.start();
        MT3.setPriority(Thread.NORM_PRIORITY);
        try{
        Thread.currentThread().join();
        }
        catch(InterruptedException ie){
            ie.getStackTrace();
        }
    }
}
