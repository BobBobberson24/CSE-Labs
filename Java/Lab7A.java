import java.util.Scanner;

public class Lab7A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a value for the size: ");
        int size = scan.nextInt();
        System.out.println("This the the requested " + size + "x" + size + " box:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}


