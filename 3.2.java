public class Main{
    public static void main(String args[]) {
    int maxValue = 50;                                                 // The maximum value to be checked.

    // Check all values from 2 to maxValue:
    for(int i = 2 ; i <= maxValue ; ++i) {   
      // Try dividing by all integers from 2 to square root of i:
      for(int j = 2 ; j <= Math.sqrt(i) ; ++j) {
        if(i%j == 0)                                                   // This is true if j divides exactly
          continue OuterLoop;                                          // so exit the loop.
      }
      // We only get here if we have a prime:
      System.out.println(i);                                           // so output the value.
    }
  }
}
