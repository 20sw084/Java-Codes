public class Student {
    String name;
    String rollNum;
    int age;
    String discipline;
    public Student(){
        name="";
        rollNum="";
        age=0;
        discipline="";
    }
    public Student(String name,String rollNum,int age,String discipline){
        this.name=name;
        this.rollNum=rollNum;
        this.age=age;
        this.discipline=discipline;
    }
    public void setDetails(String name,String rollNum,int age,String discipline){
        this.name=name;
        this.rollNum=rollNum;
        this.age=age;
        this.discipline=discipline;
    }
    public void printDetails(){
        System.out.println("Name is "+name+"\nRollNumber is "+rollNum+"\nAge is "+
        age+"years \nDiscipline is "+discipline);
    }
 /*   public static void main(String[] args) {
        Student s1=new Student();
        s1.setDetails("Ammar","20SW015",20,"Software Engineering");
        s1.printDetails();
    }*/
}