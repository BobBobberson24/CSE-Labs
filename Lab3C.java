package Lab3;

import java.util.Scanner;

public class Lab3C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of quarters: ");
        int quarters = scan.nextInt();
        double quartersValue = quarters * 0.25;

        System.out.print("Enter the number of dimes: ");
        int dimes = scan.nextInt();
        double dimesValue = dimes * 0.1;

        System.out.print("Enter the number of nickels: ");
        int nickels = scan.nextInt();
        double nickelsValue = nickels * 0.05;

        System.out.print("Enter the number of pennies: ");
        int pennies = scan.nextInt();
        double penniesValue = pennies * 0.01;

        double totalValue = quartersValue + dimesValue + nickelsValue + penniesValue;
        System.out.println("You entered " + quarters + " quarters.");
        System.out.println("You entered " + dimes + " dimes.");
        System.out.println("You entered " + nickels + " nickels.");
        System.out.println("You entered " + pennies + " pennies.");
        System.out.println("Your total is " + totalValue + ".");
    }
}