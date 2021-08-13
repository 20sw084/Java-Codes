//RightTriangle.java

public class RightTriangle{
    double hypot;
    double perp;
    double base;
    RightTriangle() {hypot=0.0;perp=0;base=0;}    
    RightTriangle(double hypot,double perp,double base){ this.hypot=hypot;this.perp=perp;this.base=base;}
    public double getHyp(double length,double angle){
        double cosValue=Math.cos(angle);
        hypot=length/cosValue;
        return hypot;
    }
    public double getPerp(double length,double angle){
        double sinValue=Math.sin(angle);
        perp=length*sinValue;
        return perp;
    }
    public double getBase(double length,double angle){
        double base;
        double cosValue=Math.cos(angle);
        base=length*cosValue;
        return base;
    }
}

//Main.java


public class Main
{
	public static void main(String[] args) {
	    RightTriangle RT1=new RightTriangle();
		System.out.println("Hypotenuse is "+RT1.getHyp(12.3,32.4));
		System.out.println("Base is "+RT1.getBase(12.3,32.4));
		System.out.println("Perpendicular is "+RT1.getPerp(12.3,32.4));
	}
}
