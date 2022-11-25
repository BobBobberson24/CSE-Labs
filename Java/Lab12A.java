import java.util.Scanner;
import java.util.Random;

class Chair {
    public int numOfLegs;
    public boolean rolling;
    public String material;
    public String rollingText;

    public Chair(int legs, boolean rolls, String mat, String text){
        numOfLegs = legs;
        rolling = rolls;
        material = mat;
        rollingText = text;

    }

    public void output() {
        System.out.println("Your chair has " + numOfLegs + " legs, " + rollingText + ", and is made of " + material);
    }

}


public class Lab12A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        int legs = scan.nextInt();


        System.out.print("Is your chair rolling (true/false): ");
        boolean rolling = scan.nextBoolean();


        System.out.print("What is your chair made of: ");
        String chairMat = scan.next();


        String rollingText = "";
        if (rolling = true) {
            rollingText = "is rolling";
        }
        else {
            rollingText = "is not rolling";
        }

        Chair newChair = new Chair(legs, rolling, chairMat, rollingText);

        newChair.output();

        if (legs == 69 && chairMat.equals("foreskin") || chairMat.equals("Foreskin")) {
            Random rand = new Random();
            int length = rand.nextInt(25);
            System.out.print("8");
            for (int i = 0; i < length; i++) {
                System.out.print("=");
            }
            System.out.print("D");
        }
    }

}
