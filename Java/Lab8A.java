import java.util.Scanner;

public class Lab8A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array1[] = new int[5];
        int array2[] = new int[5];

        System.out.println("Please enter 5 integers for the first array: ");


        for (int i = 0; i < 5; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            int num = scan.nextInt();
            array1[i] = num;
        }

        System.out.println("\nPlease enter 5 integers for the second array: ");

        for (int j = 0; j < 5; j++) {
            System.out.print("Integer " + (j + 1) + ": ");
            int num = scan.nextInt();
            array2[j] = num;
        }

        System.out.print("\nThe resulting sums are ");

        for (int k = 0; k < 5; k++) {

            System.out.print((array1[k] + array2[k]) + "|");
        }
    }
}
