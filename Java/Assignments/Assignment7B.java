import java.util.Scanner;
import java.util.Random;

public class Assignment7B {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        FSA stateMachine[] = new FSA[3];
        for (int i = 0; i < 3; i++) {
            int state = rand.nextInt(4);
            stateMachine[i] = new FSA(state);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Machine #" + i + " is starting at state " + stateMachine[i].state);
        }
        boolean allStopped = false;
        while (!allStopped) {
            System.out.println("What will you do?");
            System.out.println("-Check the current status");
            System.out.println("-Go to next state");
            System.out.println("-End");
            String input = scan.nextLine();
            if (input.equals("Check the current status")) {
                System.out.println("What machine would will you look at?");
                int machine = scan.nextInt();
                String iHateJava = scan.nextLine();
                String activeOrNot = " ";
                if (stateMachine[machine].isActive()) {
                    activeOrNot = "active";
                }
                else {
                    activeOrNot = "not active";
                }
                System.out.println("Machine #" + machine + " is " + activeOrNot + " and at state " + stateMachine[machine].state + "\n");
            }
            if (input.equals("Go to next state")) {
                System.out.println("What machine would will you advance?");
                int machine = scan.nextInt();
                String iHateJava = scan.nextLine();
                stateMachine[machine].goToNextState();
                System.out.println("You're now at state " + stateMachine[machine].state);
            }
            if (input.equals("End")) {
                System.out.println("What machine would will you stop?");
                int machine = scan.nextInt();
                String iHateJava = scan.nextLine();
                if (stateMachine[machine].end()) {
                    System.out.println("The machine has shut down");
                    stateMachine[machine].active = false;
                }
                else {
                    System.out.println("You can’t stop here; you can only stop at state 3.");
                }
            }
            if (!stateMachine[0].isActive() && !stateMachine[1].isActive() && !stateMachine[2].isActive()) {
                allStopped = true;
            }
        }
    }
}

