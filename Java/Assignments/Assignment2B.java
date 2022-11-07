import java.util.Scanner;

public class Assignment2B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the X coordinate for keyframe #1: ");
        int x1 = scan.nextInt();
        System.out.print("Enter the X coordinate for keyframe #2: ");
        int x2 = scan.nextInt();
        System.out.print("How many frames have passed? ");
        int elapsedTime = scan.nextInt();
        int totalDistance = x2 - x1;
        double fpsThirty = x1+(totalDistance*(elapsedTime/30));
        double fpsSixty = elapsedTime / 60.0 * totalDistance + x1;
        System.out.println("");
        System.out.println("The character has to move " + totalDistance + " places in a second");
        System.out.println("At 30fps, their current X position would be: " + String.format("%.4f", fpsThirty));
        System.out.println("At 60fps, their current X position would be: " + String.format("%.4f", fpsSixty));
    }

}
