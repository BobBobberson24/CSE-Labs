import java.util.Scanner;
import java.util.Arrays;

public class Lab9B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[11];

        for (int i = 0; i < 11; i++) {
            System.out.print("Integer" + " " + (i+1) + " ");
            int integer = scan.nextInt();
            array[i] = integer;
        }

        Arrays.sort(array);

        for (int j = 0; j < 11; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.print("\nTarget ");
        int target = scan.nextInt();

        boolean here = false;

        if (target == array[6]) {
            System.out.print("The target is in the array");
            here = true;
        }
        if (target < array[6]) {
            for (int i = 0; i < 6; i++) {
                if (target == array[i]) {
                    System.out.println("The target is in the array");
                    here = true;
                }

            }

        }
        if (target > array[6]) {
            for (int i = 10; i > 5; i--) {
                if (target == array[i]) {
                    System.out.println("The target is in the array");
                    here = true;
                }
            }

        }
        if (!here) {
            System.out.print("hi");
        }

    }
}
