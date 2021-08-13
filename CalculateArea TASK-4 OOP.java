//CalculateArea.java

public class CalculateArea{
  private int lenght;
  private int  breadth;
  private int side;
  
  public void setData(int lenght,int breadth){
    this.lenght=lenght;
    this.breadth=breadth;
  }
   public void setData(int side){
    this.side=side;
  }
  public void getSquareArea(){
      System.out.println("Area of Square is "+Math.pow(side,4));
  }
  public void getRectangleArea(){
      System.out.println("Area of Rectangle is "+(lenght*breadth));
  }
}

//Main.java

public class Main
{
	public static void main(String[] args) {
	    CalculateArea C1=new CalculateArea();
	    C1.setData(1,84);
	    C1.setData(84);
	    C1.getSquareArea();
	    C1.getRectangleArea();
	}
}
