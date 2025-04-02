package Models;

public class PersonalATM {
    public double balance;
    PersonalATM(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("You can't deposit negative amount");
        }
        else{
            this.balance += amount;
            System.out.println( "$"+ amount + "  deposited  to your account ");
        }


    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        }
        else{
            this.balance -= amount;
            System.out.println( "$"+ amount + "  withdrawn from your account ");
        }
    }
    public void checkBalance() {
        System.out.println("your current balance: $" + this.balance);
    }
}
