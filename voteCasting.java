import java.util.Scanner;
public class Main1 {
    String[] candidString=new String[4];
    int[] voteArray=new int[4];
    public Main1(){
        for(String s:candidString){
            s="";
        }
        for(int n:voteArray){
            n=0;
        }
    }
    public void addCandidiates(String[] candidString){
        this.candidString=candidString;
    }
    public void castVote(String name){
        for(int i=0;i<candidString.length;i++){
            if(candidString[i]==name){
                voteArray[i]++;
            }
        }
    }
    public void printResults(){
        for(int i=0;i<candidString.length;i++){
            System.out.println("Name is "+candidString[i]+"\tVotes are "+voteArray[i]);
        }
    }
    public static void main(String[] args) {
        Main1 M1=new Main1();
        String[] name=new String[4];
        name[0]="Junaid";
        name[1]="Umair";
        name[2]="Hasnain";
        name[3]="Rameez";
        M1.addCandidiates(name);
        M1.castVote("Junaid");
        M1.castVote("Junaid");
        M1.printResults();
    }
}
