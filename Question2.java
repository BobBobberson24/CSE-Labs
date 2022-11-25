import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {


        float liftCoef = (float) (1.286);
        Scanner scan = new Scanner(System.in);
        System.out.println("[NASA Lift Formulator]");
        System.out.println("The lift coefficient for this rocket is 1.286.");
        System.out.print("What is the air density? ");
        float airDen = scan.nextFloat();
        System.out.print("What is the expected velocity (m/s)? ");
        float expVel = scan.nextFloat();
        System.out.print("What is the surface area of the wing? ");
        float surfAreaWing = scan.nextFloat();
        float lift = (liftCoef * ((airDen * (expVel * expVel))/2) * surfAreaWing);
        System.out.print("The rocket's lift would be " + lift + " in these conditions.");
    }
}
