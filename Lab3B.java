package Lab3;

import java.util.Scanner;

public class Lab3B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Course 1 hours: ");
        float hours1 = scan.nextInt();
        System.out.println("Course 1 grade: ");
        float grade1 = scan.nextInt();
        float qual1 = hours1 * grade1;

        System.out.println("Course 2 hours: ");
        float hours2 = scan.nextInt();
        System.out.println("Course 2 grade: ");
        float grade2 = scan.nextInt();
        float qual2 = hours2 * grade2;


        System.out.println("Course 3 hours: ");
        float hours3 = scan.nextInt();
        System.out.println("Course 3 grade: ");
        float grade3 = scan.nextInt();
        float qual3 = hours3 * grade3;


        System.out.println("Course 4 hours: ");
        float hours4 = scan.nextInt();
        System.out.println("Course 4 grade: ");
        float grade4 = scan.nextInt();
        float qual4 = hours4 * grade4;

        float totalHours = hours1 + hours2 + hours3 + hours4;
        float totalQual = (qual1 + qual2 + qual3 + qual4);
        System.out.println("Total hours is: " + totalHours);
        System.out.println("Total quality points is: " + totalQual);
        System.out.println("Your GPA for this semester is " + totalQual/totalHours);


    }

}
