//1st.java

package mypack;
public class Main{
    public static void main(String[] args) {
        System.out.println("Jonny");
    }
	public static void find(int a, int b){
	for(int i=a;i<b;i++){
	System.out.println(i);
	}
	}
}

//2nd.java

package mypack.subpack;
import mypack.Main;
public class M{
    public static void main(String[] args) {
        System.out.println("Jonny");
	Main.find(2,9);
    }
}
