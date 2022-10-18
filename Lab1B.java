/*
Class: CSE 1321L
Section: J05
Term: Fall 2022
Instructor: Meghana Bandaru
Name: Elijah Wells
Lab# 1
*/
import java.util.Scanner;
public class Lab1B
{
    // Reads a character string from the user and prints it.
    public static void main (String[] args)
    {
        String message;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter a line of text: ");
        message = scan.nextLine();
        System.out.println ("You wrote '" + message + "'");
    }
}
