
import java.util.Scanner;

public class Lab11A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Menu \n0) Hello World \n1) Goodbye Moon \n2) Walking on Sunshine\n");
            System.out.print("What would you like to do:");
            int selection = scan.nextInt();

            if (selection == 0) {
                System.out.println("Hello!");
            } else if (selection == 1) {
                System.out.println("Ok, bye.");
            } else if (selection == 2) {
                System.out.println("WHOA!");
            }

            System.out.print("Type YES to rerun. ");
            String rerun = scan.next();
            if (!(rerun.equalsIgnoreCase("yes"))) {
                System.out.println("Program Ends");
                break;
            }
            System.out.print("\n");

        }
    }
}
