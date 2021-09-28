import java.util.Math;
public class Cylinder extends Circle {
 private double height;
    public Cylinder(){
        height=1.0;
    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius,double height){
        this(radius);
        this.height=height;
    }
    public Cylinder(double radius,double height,String color){
        super();
        this.height=height;       
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return (Math.PI*Math.sqrt(getRadius())*height);
    }
}