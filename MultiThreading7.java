//New.java

public class New {
    public void print(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}

//MultiThreading.java

public class MultiThreading extends Thread{
    New n;
    public MultiThreading(String name,New n){
        super(name);
        this.n=n;
    }
    public void run(){
        synchronized(n)
        {
            n.print();
        }
        System.out.println("Run Block is Ends here. "+Thread.currentThread().getName());
    }
}

//Main.java

public class Main {
    public static void main(String[] args) {
        MultiThreading t1=new MultiThreading("t1",new New());
        t1.start();
    }
}
