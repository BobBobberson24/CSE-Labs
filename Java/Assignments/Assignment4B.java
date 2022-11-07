import java.util.Scanner;

public class Assignment4B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Please input a number: ");
        float input = scan.nextFloat();
        boolean contBool = true;
        while (contBool) {
            System.out.println("");
            System.out.println("What would you like to do to this number: ");
            System.out.println("-1- Re-enter the number");
            System.out.println("0- Get the additive inverse of the number");
            if (input != 0) {
                System.out.println("1- Get the reciprocal of the number");
            }
            System.out.println("2- Square the number");
            System.out.println("3- Cube the number");
            System.out.println("4- Exit the program");
            System.out.println("");
            int action = scan.nextInt();
            if (action < -1 || action > 4) {
                boolean invalidInput = true;
                while (invalidInput) {
                    System.out.print("Please enter a valid number between -1 and 4: ");
                    int action2 = scan.nextInt();
                    if (action2 > -2 && action2 < 5) {
                        invalidInput = false;
                        action = action2;
                    }
                }
            }
            
            if (action == -1) {
                System.out.print("Please input a number: ");
                input = scan.nextFloat();
            }
            if (action == 0) {
                System.out.println("The additive inverse of " + input + " is " + (-input));
            }
            if (action == 1) {
                System.out.println("");
                float output = (float) (1 / input);
                System.out.println("The reciprocal of " + input + " is " + output);
            }
            if (action == 2) {
                System.out.println("");
                System.out.println("The square of " + input + " is " + (input * input));
            }
            if (action == 3) {
                System.out.println("");
                System.out.println("The cube of " + input + " is " + (input * input * input));
            }
            if (action == 4) {
                System.out.println("");
                System.out.println("Thank you, goodbye!");
                contBool = false;
            }

        }

    }
}
