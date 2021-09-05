//tkgWeight.java

public class tkgWeight{
    public static final int TtoKG=1000;
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

//Test.java

public  class Test{
    public static void main(String[] args) {
        tkgWeight[] lens=new tkgWeight[4]; 
        lens[0]=new tkgWeight(12);
        lens[1]=new tkgWeight(232.76);
        lens[2]=new tkgWeight(12,12,12);
        lens[3]=new tkgWeight();
    for(int i=0;i<lens.length;i++){
        System.out.print("weight "+i+" is "+lens[i]+"\t");
    }
    System.out.println("Addition: " + lens[0] + " plus " + lens[1] + " is " + lens[0].add(lens[1]));
    System.out.println("Subtraction: " + lens[0] + " minus " + lens[1]+ " is " + lens[0].sub(lens[1]));
    System.out.println("Multiplication: " + lens[0] + " times 10 is " + lens[0].mul(10));
    System.out.println("Division: " + lens[0] + " divided by 10 is " + lens[0].div(10));
    System.out.println("area: "  + lens[0] + " by " + lens[1] + " is " + lens[0].area(lens[1]) + " square mm");

    // Test comparison methods
    if(lens[0].greaterThan(lens[1])) {
      System.out.println("weight "+ lens[0] + " is greater than weight " + lens[1]);
    } else if(lens[0].lessThan(lens[1])) {
      System.out.println("weight "+ lens[0] + " is less than weight " + lens[1]);
    } else {
      System.out.println("weight "+ lens[0] + " is the same weight as weight " + lens[1]);
    }

    // Compare successive lens using compare() method
    String compareStr = null;
    for(int i = 0 ; i < lens.length-1 ; ++i) {
      switch(lens[i].compare(lens[i+1])) {
        case -1:
         compareStr = " is less than weight ";
         break;
        case 0:
         compareStr = " is equal to weight ";
         break;
        case 1:
         compareStr = " is greater than weight ";
         break;
      }
      System.out.println("weight " + lens[i] + compareStr + lens[i+1]);
    }
  }
}
