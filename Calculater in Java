import java.util.Scanner;

class Calculator{
    int Sum(int x,int y){
        return x+y;
    }
     int Sub(int x,int y){
        return x-y;
    }
     int Mul(int x,int y){
        return x*y;
    }
     int Div(int x,int y){
        return x/y;
    }
     int Mod(int x,int y){
        return x%y;
    }
     public static void main(String Args[])
    {
        Calculator calc=new Calculator();
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int num1=Scan.nextInt();
        System.out.println("Enter Operator");
        char op=Scan.next().charAt(0);
        System.out.println("Enter 2nd Number");
        int num2=Scan.nextInt();
        switch(op){
            case '+': {
                System.out.println(calc.Sum(num1,num2));
                        break;}
            case '-': {System.out.println(calc.Sub(num1,num2));
                        break;}
            case '*': {System.out.println(calc.Mul(num1,num2));
                        break;}
            case '/': {System.out.println(calc.Div(num1,num2));
                        break;}
            case '%': {System.out.println(calc.Mod(num1,num2));
                        break;}
            default:
            System.out.println("Invalid Input");
            }
    }

}

   
