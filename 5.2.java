//mcmLength.java

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

//Test.java

public  class Test{
    public static void main(String[] args) {
        mcmLength[] lens=new mcmLength[4]; 
        lens[0]=new mcmLength(12);
        lens[1]=new mcmLength(232.76);
        lens[2]=new mcmLength(12,12,12);
        lens[3]=new mcmLength();
    
    for(int i=0;i<lens.length;i++){
        System.out.print("Length "+i+" is "+lens[i]+"\t");
    }
    System.out.println("Addition: " + lens[0] + " plus " + lens[1] + " is " + lens[0].add(lens[1]));
    System.out.println("Subtraction: " + lens[0] + " minus " + lens[1]+ " is " + lens[0].sub(lens[1]));
    System.out.println("Multiplication: " + lens[0] + " times 10 is " + lens[0].mul(10));
    System.out.println("Division: " + lens[0] + " divided by 10 is " + lens[0].div(10));
    System.out.println("Area: "  + lens[0] + " by " + lens[1] + " is " + lens[0].calculateArea(lens[1]) + " square mm");

    // Test comparison methods
    if(lens[0].greaterThan(lens[1])) {
      System.out.println("Length "+ lens[0] + " is greater than length " + lens[1]);
    } else if(lens[0].lessThan(lens[1])) {
      System.out.println("Length "+ lens[0] + " is less than length " + lens[1]);
    } else {
      System.out.println("Length "+ lens[0] + " is the same length as length " + lens[1]);
    }

    // Compare successive lens using compare() method
    String compareStr = null;
    for(int i = 0 ; i < lens.length-1 ; ++i) {
      switch(lens[i].compare(lens[i+1])) {
        case -1:
         compareStr = " is less than length ";
         break;
        case 0:
         compareStr = " is equal to length ";
         break;
        case 1:
         compareStr = " is greater than length ";
         break;
      }
      System.out.println("Length " + lens[i] + compareStr + lens[i+1]);
    }
  }
}
