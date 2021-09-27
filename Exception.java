public class Exception{
        public static void validate (int age) {
            if(age<18){
                throw new IllegalArgumentException("Invalid Age for Vote-Casting");
            }
            else
            System.out.println("Welcome to Vote");
        }
        public static void main (String args[])
        {    
            try{
            validate(13);
            }
            catch(IllegalArgumentException ie){
                System.out.println(ie.getMessage());
            }
            System.out.println("End Of Program");
        }
    }
