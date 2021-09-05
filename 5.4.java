//in Package Measure
//mcmLength.java

package Measure;
public class mcmLength{
    public static final int CMtoMM=10;
    public static final int MtoCM=100;
    public static final int MtoMM=MtoCM*CMtoMM;
    private int meters;
    private int centimeters;
    private int millimeters;
    public mcmLength(int millimeters){
            meters=millimeters*MtoMM;
            centimeters=millimeters-(meters*MtoMM)/CMtoMM;
            this.millimeters=millimeters-meters*MtoMM-centimeters*CMtoMM;
    }
    public mcmLength(double centimeters){
        this((int)Math.round(centimeters*CMtoMM));
    }
    public mcmLength(int meters,int centimeters,int millimeters){
        this(meters*MtoMM+centimeters*CMtoMM+millimeters);
    }
    public mcmLength(){}
    public String toString() {
        return Integer.toString(meters)+" m "+centimeters+" cm "+millimeters+" mm";
    }  
    public int toMM(){
        return meters*MtoMM+centimeters*MtoCM+millimeters;
    }
    public double toM(){
        return meters+(double)(centimeters)/CMtoMM+(double)(millimeters)/MtoMM;
    }
    public mcmLength add(mcmLength len){
        return new mcmLength(toMM()+len.toMM());
    }
    public mcmLength sub(mcmLength len){
        return new mcmLength(toM()-len.toMM());
    }
    public mcmLength mul(int i){
        return new mcmLength(i*toMM());
    }
    public mcmLength div(int i){
        return new mcmLength(toMM()/i);
    }
    public long calculateArea(mcmLength len){
        return (toMM()*len.toMM());
    }
    public int compare(mcmLength len){
        return greaterThan(len)?1:equalTo(len)?0:-1;
    }
    public boolean greaterThan(mcmLength len){
        return (toMM()>len.toMM());
    }
    public boolean equalTo(mcmLength len){
        return (toMM()==len.toMM());
    }
    public boolean lessThan(mcmLength len){
        return (toMM()<len.toMM());
    }
    
}

//in same package
//tkgWeight.java

package Measure;
public class tkgWeight{
    public static final int TtoKG=40;
    public static final int KGtoG=1000;
    public static final int TtoG=TtoKG*KGtoG;
    private int tons;
    private int kilograms;
    private int grams;
    public tkgWeight(double kilograms){
        this((int)Math.round(kilograms*KGtoG));
    }
    public tkgWeight(int grams){
        this.tons=tons/TtoG;
        this.kilograms=(grams-tons*TtoG)/KGtoG;
        this.grams=grams-tons*TtoG-kilograms*KGtoG;
    }
    public tkgWeight(int tons,int kilograms,int grams){
        this(tons*TtoG+kilograms*KGtoG+grams);
    }
    public tkgWeight(){};
    public String toString(){
        return Integer.toString(tons)+" tons "+kilograms+" kgs "+grams+" grams";
    }
    public double toT(){
        return tons+(double)(kilograms)/TtoKG+(double)(grams)/TtoG;
    }
    public int toG(){
        return tons/TtoG+kilograms/KGtoG+grams;
    }
    public tkgWeight add(tkgWeight weight)
  {
    return new tkgWeight(toG()+weight.toG());
  }

  public tkgWeight sub(tkgWeight weight)
  {
    return new tkgWeight(toG()-weight.toG());
  }

  public tkgWeight mul(int n)
  {
    return new tkgWeight(n*toG());
  }

  public tkgWeight div(int y)
  {
    return new tkgWeight(toG()/y);
  }
    public long area(tkgWeight weight) {
        return (toG()*weight.toG());
      }
    
      // Compare two weights
      // Return value is 1 if current greater than arg
      //                 0 if current equal to arg
      //                -1 if current less than arg
      public int compare(tkgWeight weight) {
        return greaterThan(weight) ? 1 : (equals(weight) ? 0 : -1);
      }
    
      public boolean equals(tkgWeight weight) {
          return toG() == weight.toG();
      }
    
      public boolean lessThan(tkgWeight weight) {
          return toG() < weight.toG();
      }
    
      public boolean greaterThan(tkgWeight weight) {
          return toG() > weight.toG();
      }
}

//import Measure Package
//Carpet.java

import Measure.tkgWeight;
import Measure.mcmLength;
public class Carpet{
    public static void main(String[] args) {
    mcmLength[] carpetLengths = { new mcmLength(4,0,0), new mcmLength(3,57,0) };
    mcmLength[] carpetWidths = { new mcmLength(2,9,0), new mcmLength(5,0,0) };
    double[] carpetWtPerSqM = { 1.25, 1.05 };                          // Weight per sq m of carpets
    int[] carpetCounts = { 200, 60 };
    tkgWeight carpetWeight = null;                                    // Store for reference to weight of a carpet
    double carpetArea = 0.0;                                          // Store for area of a carpet
    for(int i = 0 ; i < carpetLengths.length ; ++i) {
      // Since we want areas in square meters it is easiest to calculate them directly
      carpetArea = carpetLengths[i].toM()*carpetWidths[i].toM();
      carpetWeight = new tkgWeight(carpetWtPerSqM[i]*carpetArea);
      System.out.println("\nCarpet " + (i + 1) + ": Size = " + carpetLengths[i] + " by "+ carpetWidths[i]);
      System.out.println("        " + "  Weight per sq. m. = " + carpetWtPerSqM[i]);
      System.out.println("        " + "  Area = " + carpetArea + " sq. m.");
      System.out.println("        " + "  Weight = " + carpetWeight);
      System.out.println("        " + "  Weight of " + carpetCounts[i] + " carpets = " + carpetWeight.mul(carpetCounts[i]));
    }
    }
}
