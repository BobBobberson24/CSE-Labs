import java.util.Scanner;
import java.util.Random;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("{SEGA Bass Fishing 2022]");
        System.out.println("Choose your fishing rod: ");
        System.out.println("A) Super Deluxe Fishing Rod");
        System.out.println("B) Stick with a String");
        char rodSel = scan.next().charAt(0);
        String rodType = "";
        if (rodSel == 'a' || rodSel == 'A') {
            rodType = "super deluxe";
            System.out.println("You chose Super Deluxe Fishing Rod! Good luck!");
        }
        if (rodSel == 'b' || rodSel == 'B') {
            rodType = "stick with string";
            System.out.println("You chose Stick with a String! Good luck!");
        }
        boolean cont = true;
        if (rodType.equals("stick with string")) {
            while (cont) {
                boolean firstChar = false;
                boolean secondChar = false;
                boolean thirdChar = false;
                boolean fourthChar = false;
                int fishCatchRand = rand.nextInt(32);
                if (fishCatchRand == 0) {
                    System.out.println("Somethings on the line!");
                    int stringBreak = rand.nextInt(3);
                    if (stringBreak == 0) {
                        System.out.println("Oops! The line broke.");
                    } else {
                        System.out.println("You reeled it in! Hooray!");
                        System.out.println("You then released it back in the lake");
                    }
                } else {
                    System.out.println("Nothings biting yet...");
                }
                System.out.print("Do you want to keep waiting or quit? ");
                String contInput = scan.next();


                for (int i = 0; i < contInput.length(); i++) {

                    //THE FOLLOWING CODE IS NOT OPTIMAL. JUST USE toLowerCase();
                    if (contInput.charAt(0) == 'W' || contInput.charAt(0) == 'w') {
                        firstChar = true;
                    }
                    if (contInput.charAt(1) == 'A' || contInput.charAt(1) == 'a') {
                        secondChar = true;
                    }
                    if (contInput.charAt(2) == 'I' || contInput.charAt(2) == 'i') {
                        thirdChar = true;
                    }
                    if (contInput.charAt(3) == 'T' || contInput.charAt(3) == 't') {
                        fourthChar = true;
                    }
                    if (firstChar && secondChar && thirdChar && fourthChar) {
                        cont = true;
                    } else {
                        cont = false;
                    }
                }


            }

        }
        if (rodType.equals("super deluxe")) {
            while (cont) {
                boolean firstChar = false;
                boolean secondChar = false;
                boolean thirdChar = false;
                boolean fourthChar = false;
                int fishCatchRand = rand.nextInt(64);
                if (fishCatchRand == 0) {
                    System.out.println("Somethings on the line!");
                    int stringBreak = rand.nextInt(20);
                    if (stringBreak == 0) {
                        System.out.println("Oops! The line broke.");
                    } else {
                        System.out.println("You reeled it in! Hooray!");
                        System.out.println("You then released it back in the lake");
                    }
                } else {
                    System.out.println("Nothings biting yet...");
                }
                System.out.print("Do you want to keep waiting or quit? ");
                String contInput = scan.next();


                for (int i = 0; i < contInput.length(); i++) {


                    if (contInput.charAt(0) == 'W' || contInput.charAt(0) == 'w') {
                        firstChar = true;
                    }
                    if (contInput.charAt(1) == 'A' || contInput.charAt(1) == 'a') {
                        secondChar = true;
                    }
                    if (contInput.charAt(2) == 'I' || contInput.charAt(2) == 'i') {
                        thirdChar = true;
                    }
                    if (contInput.charAt(3) == 'T' || contInput.charAt(3) == 't') {
                        fourthChar = true;
                    }
                    if (firstChar && secondChar && thirdChar && fourthChar) {
                        cont = true;
                    } else {
                        cont = false;
                    }
                }


            }


        }
    }
}
