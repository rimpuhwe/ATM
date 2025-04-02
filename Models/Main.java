package Models;

import java.util.Scanner;

public class Main {
    // adding a throw to catch the exceptions
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner  = new Scanner(System.in);
        int transaction;
        PersonalATM personalATM = new PersonalATM(0);
        // welcoming message when user  and prompting to enter the card
        System.out.println("Welcome to RM Bank  ATM. Please insert your card.");
        // delay for 3 seconds
        Thread.sleep(3000);
        System.out.println("Processing......");
        Thread.sleep(2000);

        while (true) {
            System.out.print(
                    """
                    Please select a transaction :
                       1. Deposit
                       2. Withdraw
                       3. Balance
                       4. Exit
                    """

            );
            transaction = scanner.nextInt();
            switch (transaction){
                case 1:{
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    personalATM.deposit(amount);
                    break;
                }
                case 2:{
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    personalATM.withdraw(amount);
                    break;
                }
                case 3:{
                    System.out.println("...Processing......");
                    Thread.sleep(5000);
                    personalATM.checkBalance();
                    break;
                }
                case 4:{
                    System.out.println("Thank you for banking with us!");
                    return;
                }
                default:{
                    System.out.println("Please select a valid transaction.");
                }
            }
        }

    }
}
