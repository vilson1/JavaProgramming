package day31;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1=new BankAccount();
        account1.setInfo("Vilson",123456789);

        account1.deposit(1000);
        account1.withdraw(900);

        account1.checkBalance();

        System.out.println("---------------------------------");

        BankAccount account2=new BankAccount();
        account2.setInfo("Ervisa",987654321);
        account2.deposit(10000);
        account2.checkBalance();
    }
}
