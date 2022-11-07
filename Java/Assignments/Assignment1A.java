import java.util.Scanner;

public class Assignment1A {
    public static void main(String[]args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the width (in pixels): ");
        int width = Scan.nextInt();
        System.out.println("Enter the height (in pixels): ");
        int height = Scan.nextInt();
        System.out.println("Enter the resolution (PPI): ");
        int resolution = Scan.nextInt();
        float finalWidth = width / resolution;
        float finalHeight = height / resolution;

        System.out.println("At" + resolution + " PPI, the image is " + finalWidth + " inches wide and " + finalHeight + " tall");

    }
}
