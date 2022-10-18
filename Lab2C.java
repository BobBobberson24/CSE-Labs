/*
Class: CSE 1321L
Section: J05
Term: Fall 2022
Instructor: Meghana Bandaru
Name: Elijah Wells
Lab# 2
*/

import java.util.Scanner;

public class Lab2C {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter a width: ");
        int width = scan.nextInt();
        System.out.print("Enter a height: ");
        int height = scan.nextInt();
        int halfPerimeter = width + height;
        System.out.println("The area is " + width * height);
        System.out.println("The perimeter is " + ((width + height) * 2));


    }

}
