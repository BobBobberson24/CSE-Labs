import java.util.Random;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("[Random math]");
        System.out.print("Enter the first number: ");
        float num1 = scan.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = scan.nextFloat();
        Random rand = new Random();
        int randMath = rand.nextInt(4);
        if (randMath == 0) {
            System.out.println("We randomly chose... division!");
            if (num1 == 0 || num2 == 0) {
                System.out.println("You can't divide by 0!");
            }
            if (num1 != 0 && num2 != 0) {
                System.out.println(num1/num2);
            }
        }
        else if (randMath == 1) {
            System.out.println("We randomly chose... addition!");
            System.out.println(num1 + num2);
        }
        else if (randMath == 2) {
            System.out.println("We randomly chose... subtraction!");
            System.out.println(num1 - num2);
        }
        else if (randMath == 3) {
            System.out.println("We randomly chose... multiplication!");
            System.out.println(num1 * num2);
        }
    }
}

