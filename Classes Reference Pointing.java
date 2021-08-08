//class Class
public class Class{
    String s1;
    String s2;
    void SetS(String s,String z){
     s1=s;
     s2=z;
    }
}
//class Main
public class Main
{
	public static void main(String[] args) {
	    Class c1=new Class();
	    Class c2=new Class();
	    c1.SetS("Jonny","Rajput");
	    c2.SetS("Rameez","Sarki");
	    c2.s1="Junaid";
	    c1=c2;
		System.out.println(c1.s1+" "+c1.s2);
		System.out.println(c2.s1+" "+c2.s2);
	}
}
