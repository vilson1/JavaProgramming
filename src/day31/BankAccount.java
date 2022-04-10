package day31;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: $"+balance);
    }

    public void deposit(double amount){
        if (amount<=0){
            System.out.println("Tour amount must be a positive number");
            return;
        }
        balance+=amount;
    }

    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("Insufficent Amout");
            return;
        }
        if (amount<=0){
            System.out.println("The amount shouldn't be negative or Zero");
            return;
        }
        balance-=amount;
    }



}
