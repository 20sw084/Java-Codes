//Overload.java

public class Overload{
  private char ch;
  private int  num;
  
  public void setData(char ch,int num){
    this.ch=ch;
    this.num=num;
  }
   public void setData(int num,char ch){
    this.ch=ch;
    this.num=num;
  }
  public void getData(){
      System.out.println("Character is "+ch+"\nNumber is "+num);
  }
}

//Main.java

public class Main
{
	public static void main(String[] args) {
	    Overload Obj1=new Overload();
	    Obj1.setData('J',84);
	    Obj1.getData();
	}
}
