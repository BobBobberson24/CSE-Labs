import java.util.Scanner;


public class Assignment7A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("[Finite State Automata]");
        System.out.print("What state do you want to start at? ");
        int startState = scan.nextInt();
        String javaSucksBecauseItLeavesACharacterInTheBuffer = scan.nextLine();
        FSA stateMachine = new FSA(startState);
        while (true) {
            System.out.println("What will you do?");
            System.out.println("-Go to next state");
            System.out.println("-End");
            String input = scan.nextLine();
            if (input.equals("Go to next state")) {
                stateMachine.goToNextState();
                System.out.println("You are now in state " + stateMachine.state);
            }
            if (input.equals("End")) {
                if (stateMachine.end()) {
                    System.out.println("The machine has shut down");
                    break;
                }
                else {
                    System.out.println("You can’t stop here; you can only stop at state 3.");
                }
            }
        }
    }
}
