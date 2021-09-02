public class Main {
public static void main(String a[]) {
    System.out.println(sum(15,30,84,2));
}
private static int sum(int...ints) {
    int sum=0;
    for(int i:ints){
        sum+=i;
    }
    return sum;
    }
}
