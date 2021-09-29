//Shape.java

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        color="";
        filled= null;
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled= filled;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        if(filled!=true&&filled!=false){
            return false;
        }
        else
        return true;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}

//Circle.java


public class Circle extends Shape {
    protected double radius;
    public Circle(){
        radius=0.0;
    } 
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*Math.sqrt(radius);
    }
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
    public String toString(){
        return ("[\"CircleIsFilled="+isFilled()+",ColourIs="+getColor()+",AreaOfCircle="+getArea()+",PerimeterOfCircle="+getPerimeter()+"\"]");
    }
}

//Rectangle.java

public abstract class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        width=0.0;
        length=0.0;
    } 
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}

//Square.java

public class Square extends Rectangle{
    private double side;    
    public Square(){
        side=0.0;
    } 
    public Square(double side){
        this.side=side;
    }
    public Square(double sides,String color,boolean filled){
        super(sides,sides,color,filled);
        side=sides;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
    }
    public double getArea(){
        return Math.sqrt(side);
    }
    public double getPerimeter(){
        return 4*side;
    }
    public String toString(){
        return ("[\"SquareIsFilled="+isFilled()+",ColourIs="+getColor()+",AreaOfSquare="+getArea()+",PerimeterOfSquare="+getPerimeter()+"\"]");
    }   
}

//Main4.java

public class Main4 {
    public static void main(String[] args) {
        Square S1=new Square(4.5,"Yellow",true);
        System.out.println(S1.toString());
        Circle C1=new Circle(6.2,"No-Color Set Yet",false);
        System.out.println(C1.toString());
    }
}
