public class Class2{
    private int a;
    private int b;
    private int c;
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public void setC(int c){
        this.c=c;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
}
public class Class1{
    private int First;
    Class2 C21=new Class2();
    public void setFirst(int First){
        this.First=First;
    }
    public void setC21(Class2 C21){
        this.C21=C21;
    }
    public void setAll(int First,Class2 C21){
        this.First=First;
        this.C21=C21;
    }
    public int getFirst(){
        return First;
    }
    public Class2 getC21(){
        return C21;
    }
    public int printAll(){
        System.out.println("First INT is "+First);
        System.out.println("A is "+getA()+"B is "+getB()+"C is "+getC());
    }
} 
public class Main
{
	public static void main(String[] args) {
	    Class1 C11=new Class1();
	    C11.setFirst(1);
	    Class2 C21=new Class2();
	    C21.setA(2);
	    C21.setB(3);
	    C21.setC(4);
	    C11.setAll(1,C21);
		C11.getAll();
	}
}
