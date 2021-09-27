//InvalidAgeException.java

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String s){
        super(s);
    }
}

//ExceptionEg.java

    public class ExceptionEg{
        public static void m()throws InvalidAgeException{
            throw new InvalidAgeException("Exception Found");
        }
        public static void n()throws InvalidAgeException{
            m();
        }
        public static void p(){
            try{
                n();
            }
            catch(InvalidAgeException ie){
                System.out.println("Handled Now");
            }
        }
        public static void main(String[] args) {
            p();
            System.out.println("End of Program");
        }
    }
