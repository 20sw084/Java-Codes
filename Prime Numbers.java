public class Main{
    public static void main(String[] args) {
        int limit=20;
        for(int i=1;i<=20;i++){
            for(int j=1;j<i;j++){
                if(j%2==0){
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
