//MultiThreading.java

public class MultiThreading implements Runnable{
    @Override
    public void run(){
        System.out.println("Run Block is Running of ID "+Thread.currentThread().getId());
        System.out.println("Name of Thread is "+Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
            ie.getStackTrace();
        }
        System.out.println("Run Block is Ends here. "+Thread.currentThread().getName());
    }
}

//Main.java

public class Main {
    public static void main(String[] args) {
        Thread MT1=new Thread(new MultiThreading(),"MT1");
        MT1.start();  //Used when every thread is executed
        Thread MT2=new Thread(new MultiThreading(),"MT2");
        MT2.start();
    }
}
