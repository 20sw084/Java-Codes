//Runner.java

// public class WithdrawRunnable implements Runnable{
//     public void run(){
//         System.out.println("Running"); 
//     }
// }

public class Runner extends Thread{
    // public  synchronized void Counter(){
    //     for(int i=0;i<5;i++){
    //         System.out.println(Thread.currentThread().getName()+"\t\t"+i);
    //     }
    // }   
    
    public void run(){
        // Thread.currentThread().suspend();
        // Thread.currentThread().resume();/
        // Counter();
        for(int i=0;i<5;i++)
        {
            System.out.println("Running...\t"+Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getName()+"\t\t\t"+Thread.currentThread().getPriority()+"\t\t\t"+Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().isDaemon());
    }
}

//Main.java

public class Main{
    public synchronized static void print(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"\t\t"+i);
        }
    }
    public static void main(String[] args) {
        // Thread wr=new Thread(new WithdrawRunnable());
        // wr.start();
        // WithdrawRunnable wr=new WithdrawRunnable();
        // wr.start();
        Runner wr=new Runner();
        
        // synchronized(wr){
        //     for(int i=0;i<5;i++){
        //         System.out.println(Thread.currentThread().getName()+"\t\t"+i);
        //     }
        // } 

        Thread wr1=new Thread(new Runner(),"MYTHREAD-1");
        Thread wrr=new Thread(new Runner(),"MYTHREAD-2");
        
        //Overloaded constructors are:
        // 1.   Thread()
        // 2.   Thread(String name) 
        // 3.   Thread(Runnable r)
        // 4.   Thread(Runnable r,String name) 
        wr1.start();
        print(); 
        wrr.start();  
             
        try {
            Thread.sleep(2000);
            wr.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End.");
    }
}
