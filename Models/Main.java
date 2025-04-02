package Models;

import java.util.Scanner;

public class Main {
    // adding a throw to catch the exceptions
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner  = new Scanner(System.in);
        PersonalATM personalATM = new PersonalATM(0);
        // welcoming message when user  and prompting to enter the card
        System.out.println("Welcome to RM Bank  ATM. Please insert your card.");
        // delay for 3 seconds
        Thread.sleep(3000);
        System.out.println("Processing......");

    }
}
