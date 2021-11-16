//Papers.java

public abstract class Papers {
    int numberOfSubjects;
    String subjects[];
    public Papers(){
        numberOfSubjects=0;
        subjects=null;
    }
    public Papers(int numberOfSubjects){ 
        this.numberOfSubjects=numberOfSubjects;
        subjects=null;
    }
    public Papers(int numberOfSubjects,String[] subjects){  
        this.numberOfSubjects=numberOfSubjects;
        this.subjects=subjects;
    }
    public void getPapers(){
        System.out.println("Total Papers are: "+subjects.length); 
        System.out.println("\nmm/dd/yyyy\t\t\tSubjects\n");
        for(int i=0;i<subjects.length;i++){
            System.out.println(subjects[i]);
        } 
    }
    public  abstract  void absMethod();
}

//Finals.java

public class Finals extends Papers{
    boolean attendance;
    int numberOfSubjects;
    public Finals(){
        // super();
        super.numberOfSubjects=0;
        super.subjects=null;
        attendance=false;
    }
    public Finals(int numberOfSubjects,String[] subjects,Boolean attendance){  
        // super(numberOfSubjects,subjects);
        super.numberOfSubjects=numberOfSubjects;
        super.subjects=subjects;
        this.attendance=attendance;
    }
    public void getFinals(){
        if(attendance==true){
        System.out.println("Total Papers are: "+subjects.length); 
        System.out.println("\nmm/dd/yyyy\t\t\tSubjects\n");
        for(int i=0;i<subjects.length;i++){
            System.out.println(subjects[i]);
        } 
        }
        else{
            System.out.println("Sorry! Your Attendance is less than 75%"); 
        }
    }
    public void absMethod(){
        System.out.println("Nothing here"); 
    }
}

//Main.java

public class Main {
    public static void main(String[] args) {
        String[] finals_second_sems_Schedule={"11/23/2021\t\t\tLAAG","11/25/2021\t\t\tPS+IS","11/27/2021\t\t\tISE","11/29/2021\t\t\tOOP(TH)","12/01/2021\t\t\tPP","12/02/2021\t\t\tOOP(PR)"};
        Papers second_sems;
        boolean attend=true;
        second_sems=new Finals(finals_second_sems_Schedule.length,finals_second_sems_Schedule,attend);
        second_sems.getPapers();
        Finals fourth_sems;
        String[] finals_4th_sems_Schedule={"11/22/2021\t\t\tOS(TH)","11/24/2021\t\t\tCN(TH)","11/26/2021\t\t\tSDA(TH)","11/28/2021\t\t\tIEC","11/30/2021\t\t\tDW","12/01/2021\t\t\tOS(PR)","12/02/2021\t\t\tCN(PR)","12/03/2021\t\t\tSDA(PR)"};
        fourth_sems=new Finals(finals_4th_sems_Schedule.length,finals_4th_sems_Schedule,attend);
        fourth_sems.getFinals();
        
    }
}
