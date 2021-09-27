public class Exception{
        public static void m()throws IllegalArgumentException{
            throw new IllegalArgumentException("Exception Found");
        }
        public static void n()throws IllegalArgumentException{
            m();
        }
        public static void p(){
            try{
                n();
            }
            catch(IllegalArgumentException ie){
                System.out.println("Handled Now");
            }
        }
        public static void main(String[] args) {
            p();
            System.out.println("End of Program");
        }
    }
