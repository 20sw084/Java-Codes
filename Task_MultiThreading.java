//BankAccount.java

 import java.util.concurrent.locks.Condition;
 import java.util.concurrent.locks.Lock;
 import java.util.concurrent.locks.ReentrantLock;
 /**
 A bank account has a balance that can be changed by
 deposits and withdrawals.
 */
 public class BankAccount
 {
 private double balance;
 private Lock balanceChangeLock;
 private Condition sufficientFundsCondition;
 public BankAccount()
 {
 balance = 100;
 balanceChangeLock = new ReentrantLock();
 sufficientFundsCondition = balanceChangeLock.newCondition();
 }
 public void deposit(double amount)
 {
 balanceChangeLock.lock();
 try
 {     
    System.out.print("Depositing " + amount);
    double newBalance = balance + amount;
    System.out.println(", new balance is " + newBalance);
    balance = newBalance;
    sufficientFundsCondition.signalAll();
}
    finally
    {
    balanceChangeLock.unlock();
    }
}
public void withdraw(double amount)
 throws InterruptedException
 {
 balanceChangeLock.lock();
 try
 {
 while (balance < amount)
 {
 sufficientFundsCondition.await();
 }
 System.out.print("Withdrawing " + amount);
 double newBalance = balance - amount;
 System.out.println(", new balance is " + newBalance);
 balance = newBalance;
 }
 finally
 {
 balanceChangeLock.unlock();
 }
 }

 /**
 Gets the current balance of the bank account.
@return the current balance
 */
 public double getBalance()
 {
 return balance;
 } 

}

//DepositRunnable.java

// public class DepositRunnable {
/**
 A deposit runnable makes periodic deposits to a bank account.
 */
 public class DepositRunnable implements Runnable
 {
 private static final int DELAY = 1;
 private BankAccount account;
 private double amount;
 private int count;

/**
 Constructs a deposit runnable.
 @param anAccount the account into which to deposit money
 @param anAmount the amount to deposit in each repetition
 @param aCount the number of repetitions
 */
 public DepositRunnable(BankAccount anAccount, double anAmount,
 int aCount)
 {
 account = anAccount;
 amount = anAmount;
 count = aCount;
 }

 public void run()
 {
 try
 {
 for (int i = 1; i <= count; i++)
 {
     if(i<count){
 account.deposit(amount);
 Thread.sleep(DELAY);
     }
 }
 }
 catch (InterruptedException exception) {}
 }
 }
 
//WithdrawRunnable.java

public class WithdrawRunnable implements Runnable
 {
 private static final int DELAY = 1;
 private BankAccount account;
 private double amount;
 private int count;
/**
 Constructs a withdraw runnable.
 @param anAccount the account from which to withdraw money
 @param anAmount the amount to withdraw in each repetition
 @param aCount the number of repetitions
 */
 public WithdrawRunnable(BankAccount anAccount, double anAmount,
 int aCount)
 {
 account = anAccount;
 amount = anAmount;
 count = aCount;
 }

 public void run()
 {
 try
 {
 for (int i = 1; i <= count; i++)
 {
 account.withdraw(amount);
 Thread.sleep(DELAY);
 }
 }
 catch (InterruptedException exception) {}
 }
 }
 
//BankAccountThreadRunner.java

public class WithdrawRunnable implements Runnable
 {
 private static final int DELAY = 1;
 private BankAccount account;
 private double amount;
 private int count;
/**
 Constructs a withdraw runnable.
 @param anAccount the account from which to withdraw money
 @param anAmount the amount to withdraw in each repetition
 @param aCount the number of repetitions
 */
 public WithdrawRunnable(BankAccount anAccount, double anAmount,
 int aCount)
 {
 account = anAccount;
 amount = anAmount;
 count = aCount;
 }

 public void run()
 {
 try
 {
 for (int i = 1; i <= count; i++)
 {
 account.withdraw(amount);
 Thread.sleep(DELAY);
 }
 }
 catch (InterruptedException exception) {}
 }
 }
