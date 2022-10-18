import java.util.Scanner;

public class Lab9A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int intArray[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            int input = scan.nextInt();
            intArray[i] = input;
        }

        System.out.println("Enter desired number: ");
        int desNum = scan.nextInt();
        int j = 0;

        while (true) {
            if (intArray[j] == desNum) {
                System.out.println("The number is here bitch");
                break;
            }
            j++;
            if (j == 10) {
                System.out.println("The number is not here bitch");
                break;
            }
        }
    }
}
