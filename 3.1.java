public class Main{    
    public static void main(String[] args){
        int randomChoice=0;
        randomChoice=(int) (6*Math.random());
        switch(randomChoice){
            case 1:
            System.out.println("The breakfast is scrambled eggs");
            break;
            case 2:
            System.out.println("The breakfast is waffles");
            break;
            case 3:
            System.out.println("The breakfast is fruit");
            break;
            case 4:
            System.out.println("The breakfast is cereal");
            break;
            case 5:
            System.out.println("The breakfast is toast");
            break;
            case 6:
            System.out.println("The breakfast is yougurt");
            break;
        }   
    }
}
