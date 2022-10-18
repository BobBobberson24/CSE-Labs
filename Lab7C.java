import java.util.Scanner;

public class Lab7C {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a value for the size: ");
        int size = scan.nextInt();
        System.out.print("This is the requested " + size + "x" + size + " right-triangle: ");



        for (int i = 0; i < size; i++) {
            for (int j = i; j < (size - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");

            }
            System.out.print("\n");
        }



    }
}