//MultiThreading.java

public class MultiThreading implements Runnable{
    @Override
    public void run(){
        try{
            Thread.sleep(2000);
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
        Thread MT1=new Thread(new MultiThreading(),"MT1");
        Thread MT2=new Thread(new MultiThreading(),"MT2");
        Thread MT3=new Thread(new MultiThreading(),"MT3");
        MT1.start();  //Used when every thread is executed
        MT1.setName("T!1");
        MT2.start();
        MT3.start();
        try{
        Thread.currentThread().join();
        Thread.currentThread().join();
        Thread.currentThread().join();
        }
        catch(InterruptedException ie){
            ie.getStackTrace();
        }
        finally{
            System.err.println("DOne");
        }
    }
}
