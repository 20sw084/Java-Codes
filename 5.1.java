//Point.java

public class Point{
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public Point(Point p) {
    x = p.x;
    y = p.y;
    }
     double getX(){
        return x;
    }
     double getY(){
        return y;
    }
    public String toString(){
    return x +","+y;
  }
  // Fields store the point coordinates
  private double x;
  private double y;
}

//Rectangle.java

public class Rectangle{
    private Point topleft;
    private Point bottomright;
    public Rectangle(double x1,double y1,double x2,double y2)
    {
        topleft=new Point (Math.min(x1,x2),Math.min(y1,y2));
        bottomright=new Point(Math.max(x1,x2),Math.max(x1,x2));
    }
    public Rectangle( Point tl,Point br){
        this(tl.getX(),tl.getY(),br.getX(),br.getY());
    } 
    public Rectangle (Rectangle R1){
        topleft=new Point(R1.topleft);
        bottomright=new Point(R1.bottomright);
    }
    public Rectangle encloses(Rectangle R1) {
    return new Rectangle(Math.min(topleft.getX(), R1.topleft.getX()),
                         Math.min(topleft.getY(), R1.topleft.getY()),
                         Math.max(bottomright.getX(), R1.bottomright.getX()),
                         Math.max(bottomright.getY(), R1.bottomright.getY()));
 
   }
    public String toString()  {
    return "Rectangle: " + topleft + " : " + bottomright;
    }
}

//Main.java



public class Main
{
	public static void main(String[] args) {
	    Rectangle[] R=new Rectangle[4];
	    Rectangle enclosing;
	    for(int i=0;i<R.length;i++){
	     R[i]=new Rectangle(Math.random()*100,Math.random()*100,Math.random()*100,Math.random()*100); 
	     System.out.print("Coords of rectangle " + i + " are: ");
         System.out.println(R[i]);
	    }
	     enclosing = R[0];
	     for(Rectangle rect : R)  {
         enclosing = enclosing.encloses(rect);
         }
    System.out.println("\nCoords of Enclosing rectangle are ");
    System.out.println(enclosing);
	    
	}
}

