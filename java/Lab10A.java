import java.util.Scanner;

public class Lab10A {



    static void max(int a, int b) {
        System.out.println("Max is " + Math.max(a, b));
    }
    static void min(int a, int b) {
        System.out.println("Min is " + Math.min(a, b));
    }
    static void average(int a, int b) {
        System.out.println("Average is " + (a + b)/2);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1st int: ");
        int int1 = scan.nextInt();
        System.out.print("2nd int: ");
        int int2 = scan.nextInt();
        max(int1, int2);
        min(int1, int2);
        average(int1, int2);



    }
}
