public class StudentResult {
    Student std1;
    Marksheet m1;
    public StudentResult(){
        std1=new Student("","",0,"");
        m1=new Marksheet(0,0,0);
    }
    public StudentResult(Student std1,Marksheet m1){
        this.std1=std1;
        this.m1=m1;
    }
    public void setDetails(Student std1,Marksheet m1){
        this.std1=std1;
        this.m1=m1;
    }
    public void createStudentResult(){
        std1.printDetails();
        m1.calculateMarks();
        m1.calculatePercentage();
        m1.calculateGrade();
    }
    public static void main(String[] args) {
        Student std1=new Student("Rameez Sarki","20SW002",20,"Software Engineering");
        Marksheet m1=new Marksheet(84,30,92);
        StudentResult stdres1=new StudentResult(std1,m1);
        stdres1.createStudentResult();
    }
}
