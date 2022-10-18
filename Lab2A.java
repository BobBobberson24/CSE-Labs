/*
Class: CSE 1321L
Section: J05
Term: Fall 2022
Instructor: Meghana Bandaru
Name: Elijah Wells
Lab# 2
*/

import java.util.Scanner;

public class Lab2A {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a name: ");
        String name1 = scan.nextLine();
        System.out.print("Enter another name: ");
        String name2 = scan.nextLine();
        System.out.print("Enter a verb: ");
        String verb = scan.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = scan.nextLine();

        System.out.println("Once upon a time, there was a person named " + name1 + " who had a child named " + name2 + ". This child would " + verb + " " + adverb + " while singing to strangers.");


    }
}
