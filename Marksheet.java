public class Marksheet {
    int oopMarks;
    int pfMarks;
    int dsaMarks;
    public Marksheet(){
        oopMarks=0;
        pfMarks=0;
        dsaMarks=0;
    }
    public Marksheet(int oopMarks,int pfMarks,int dsaMarks){
        this.oopMarks=oopMarks;
        this.pfMarks=pfMarks;
        this.dsaMarks=dsaMarks;
    }
    public void setMarks(int oopMarks,int pfMarks,int dsaMarks){
        this.oopMarks=oopMarks;
        this.pfMarks=pfMarks;
        this.dsaMarks=dsaMarks;
    }
    public void calculateMarks(){
        System.out.println("Total Marks is "+(oopMarks+pfMarks+dsaMarks));
    }
    public void calculatePercentage(){
        int totalMarks=oopMarks+pfMarks+dsaMarks;
        System.out.println("Percentage is "+((double)totalMarks/3+"%"));
    }
    public void calculateGrade(){
        double percentage=(double)(oopMarks+pfMarks+dsaMarks)/3;
        if(percentage>=80){
        System.out.println("Grade is A-1");
        }
        else if(percentage<80 && percentage>=70){
            System.out.println("Grade is A");
        }
        else if(percentage<70 && percentage>=60){
            System.out.println("Grade is B");
        }
        else if(percentage<60 && percentage>=50){
            System.out.println("Grade is C");
        }
        else if(percentage<50 && percentage>=40){
            System.out.println("Grade is D");
        }
        else
        System.out.println("Fail");
    }
   /* public static void main(String[] args) {
        Marksheet Std1=new Marksheet();
        Std1.setMarks(60,84,30);
        Std1.calculateMarks();
        Std1.calculatePercentage();
        Std1.calculateGrade();
    }*/
}
