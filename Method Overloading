public class Main
{
	public static void main(String[] args) {
	    Overloading O1=new Overloading(17);
	    Overloading O2=new Overloading(18,"Jonny");
	    Overloading O3=new Overloading(19,"Rameez",123.4);
	    Overloading O4=new Overloading(20,"Ammar",234.4,"SWE");
	    Overloading O5=new Overloading();
	    Overloading O6=new Overloading();
	    Overloading O7=new Overloading();
	    Overloading O8=new Overloading();
	    Overloading O9=new Overloading();
	    O6.setValues(21);
	    O7.setValues(22,"Niaz");
	    O8.setValues(23,"Ali",231.2);
	    O9.setValues(24,"Wasay",432.2,"SWE");
		System.out.println("Its Object 1:\n ");O1.getValues();
		System.out.println("Its Object 2:\n ");O2.getValues();
		System.out.println("Its Object 3:\n ");O3.getValues();
		System.out.println("Its Object 4:\n ");O4.getValues();
		System.out.println("Its Object 5:\n ");O5.getValues();
		System.out.println("Its Object 6:\n ");O6.getValues();
		System.out.println("Its Object 7:\n ");O7.getValues();
		System.out.println("Its Object 8:\n ");O8.getValues();
		System.out.println("Its Object 9:\n ");O9.getValues();
	}
}
public class Overloading{
    int age;
    String name;
    double basic_pay;
    String Deptt;
    Overloading() { age=0;name=" ";basic_pay=0;Deptt=" ";}
    Overloading(int a) { age=a;}
    Overloading(int a,String n) { age=a;name=n;}
    Overloading(int a,String n,double bp) { age=a;name=n;basic_pay=bp;}
    Overloading(int a,String n,double bp,String d) { age=a;name=n;basic_pay=bp;Deptt=d;}
    void setValues(){
        System.out.println("No Values set.");
    }
    void setValues(int a){
        age=a;
        System.out.println("Age Value set only.");
    }
    void setValues(int a,String n){
        age=a;
        name =n;
        System.out.println("Age and Name set only.");
    }
    void setValues(int a,String n,double bp){
        age=a;
        name =n;
        basic_pay=bp;
        System.out.println("Age, Name and basic_pay set only.");
    }
    void setValues(int a,String n,double bp,String d){
        age=a;
        name =n;
        basic_pay=bp;
        Deptt=d;
        System.out.println("Age, Name, basic_pay and Deptt set.");
    }
    void getValues(){
       System.out.println("Age is "+age+"Name is "+name+"Basic pay is "+basic_pay+"Deptt is "+Deptt); 
    }
}
