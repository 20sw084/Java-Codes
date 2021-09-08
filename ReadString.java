import java.util.Scanner;
public class ReadString {
    public static void main(String[] args) {
        String strarr1;
        String strarr2;
        Scanner input=new Scanner(System.in);
        strarr1=input.nextLine();
        strarr2=input.nextLine();
        String[] splitted1=strarr1.split(",");
        String[] splitted2=strarr2.split(",");
        System.out.println("Student 1");
        for(int i=0;i<splitted1.length;i++){
                if(i==0){
                    System.out.println("Name: "+splitted1[i]);
                }
                else if(i==1){
                    System.out.println("Age: "+splitted1[i]);
                }
                else if(i==2){
                    System.out.println("Program: "+splitted1[i]);
                }
        }
    System.out.println("Student 2");
        for(int i=0;i<splitted2.length;i++){
                if(i==0){
                    System.out.println("Name: "+splitted2[i]);
                }
                else if(i==1){
                    System.out.println("Age: "+splitted2[i]);
                }
                else if(i==2){
                    System.out.println("Program: "+splitted2[i]);
                }
        }
}
}