import java.util.Scanner;

public class Lab10B {

    static boolean isValid(double width, double height) {
        boolean isValidBool = false;

        if (width + height >=30) {
            isValidBool = true;
        }

        return isValidBool;
    }

    static double area(double width, double height) {
        double area = 0;
        if (isValid(width, height)) {
            area = width*height;
        }
        return area;
    }

    static double perimeter(double width, double height) {
        double perimeter = 0;
        if (isValid(width, height)) {
            perimeter = (2*width) + (2*height);
        }
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean contBool = false;
        int tylerSux = 0;



        while(true) {
            System.out.print("Enter width: ");
            double width = scan.nextDouble();
            System.out.print("Enter height: ");
            double height = scan.nextDouble();

            if (!(isValid(width, height))) {
                System.out.println("This is an invalid rectangle\n");
            }

            else {
                System.out.print("This is a valid rectangle");
                System.out.print("\nThe area is: " + area(width, height));
                System.out.println("\nThe perimeter is: " + perimeter(width, height) + "\n");
            }

            System.out.print("Do you want to enter another width and height (Y\\N)? : ");

            char contInput = scan.next().charAt(0);

            if (contInput == 'N' || contInput == 'n') {
                break;
            }


        }

    }
}
