// Bank.java

public class Bank {
    int amount;
    public void deposit(int amount){
    }
    public void withdraw(int amount){
        try{
        if(this.amount<amount){
            throw new InsufficientFundsException("Funds not available");
        }
        }
        catch(InsufficientFundsException ife){
            System.out.println("Funds not available");
        }
    }
}

//InsufficientFundsException.java

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String name){
        super(name);
    }
}

// Main.java

public class Main{
    public static void main(String[] args){
        Bank b=new Bank();
        b.withdraw(12);
    }
}
