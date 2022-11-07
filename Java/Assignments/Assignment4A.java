import java.util.Scanner;

public class Assignment4A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Ghana = 0;
        int PaxB = 0;
        int Italy = 0;
        int CostaR = 0;
        boolean contBool = true;
        int studentNum = 1;
        System.out.println("[CCSE Study Abroad Program]");

        while (contBool) {
            System.out.println("Student #" + studentNum + ": Which country should we go to for our next study abroad program?");
            System.out.println("Italy");
            System.out.println("Costa Rica");
            System.out.println("Pax Bisonica");
            System.out.println("Ghana");
            System.out.println("(Type Quit to end the survey)");
            String input = scan.nextLine();
            if (input.equals("Ghana")) {
                Ghana++;
                System.out.println("Thank You!\n");
            }
            if (input.equals("Pax Bisonica")) {
                PaxB++;
                System.out.println("Thank You!\n");
            }
            if (input.equals("Italy")) {
                Italy++;
                System.out.println("Thank You!\n");
            }
            if (input.equals ("Costa Rica")) {
                CostaR++;
                System.out.println("Thank You!\n");
            }
            if (input.equals("Quit") || input.equals("quit")) {
                System.out.println("Thank you!");
                System.out.println("[Results]");
                System.out.println("Italy: " + Italy);
                System.out.println("Costa Rica: " + CostaR);
                System.out.println("Pax Bisonica: " + PaxB);
                System.out.println("Ghana: " + Ghana);
                System.out.print("Next years study abroad program will take place in ");
                if (Math.max(Italy, CostaR) > Math.max(PaxB, Ghana)) {
                    if (Italy > CostaR) {
                        System.out.print("Italy");
                    }
                    if (CostaR > Italy) {
                        System.out.print("Costa Rica");
                    }
                }
                if (Math.max(PaxB, Ghana) > Math.max(Italy, CostaR)) {
                    if (PaxB > Ghana) {
                        System.out.print("Pax Bisonica");
                    }
                    if (Ghana > PaxB) {
                        System.out.print("Ghana");
                    }
                }
                contBool = false;

            }
        }
            studentNum++;








            }



    }

