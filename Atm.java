package day_19;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to bank atm");
        System.out.println("insert your card");
        System.out.println("enter your balance");
        int balance = scanner.nextInt();
        System.out.println("enter your overdraft balance");
        int overdraftbalance = scanner.nextInt();
        while (true) {
            System.out.println("Do you want to make a deposit(1), a cashout(2), or exit(3)?");
            int oper = scanner.nextInt();
            if (oper == 1) {
                System.out.println("how much do you want to deposit");
                int deposit = scanner.nextInt();
                System.out.println("Successfully deposited " + deposit + "$ balance " +(deposit + balance) + "$");
            }
            else if (oper == 2) {
                System.out.println("How much do you want to withdraw:" );
                int withdr = scanner.nextInt();
                System.out.println("Successfully cashed out" + withdr + "$ "+ "balance" + (withdr - balance) + "$");
            }
            else if (oper ==3){
                System.out.println("thank you");
            }
            break;
        }
    }
}
