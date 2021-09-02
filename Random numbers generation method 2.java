import java.util.Random;
public class Main {
	public static void main(String[] args) {
        Random rand=new Random();
	System.out.println(rand.nextInt());     //Any Random Number
    System.out.println(rand.nextInt(100));      //Random Number Between 0 t0 99
    System.out.println(rand.nextInt(100)+1);      //Random Number Between 0 t0 100
	}
}
