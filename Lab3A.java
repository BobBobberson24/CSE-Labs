package Lab3;

import java.util.Scanner;

public class Lab3A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount owed: ");
        double owed = scan.nextFloat();
        System.out.print("Enter APR: ");
        double apr = scan.nextFloat();
        System.out.println("Monthly percentage rate: " + apr / 12);
        System.out.println("Minimum payment: " + (apr * owed / 12));

    }
}
