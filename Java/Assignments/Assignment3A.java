import java.util.Scanner;

public class Assignment3A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Epic Quest Simulator");
        System.out.println("Hello stranger! Do you have time to hear my tale?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        int prompt1 = scan.nextInt();
        if (prompt1 == 1) {
            System.out.println("Thank you! I come from the land of Pax Bisonica. Our country has been taken over by a cruel tyrant!");
            System.out.println("1) That's awful!");
            System.out.println("2) What can I do?");
            int prompt2 = scan.nextInt();
            if (prompt2 == 1) {
                System.out.println("Alas, it is truly terrible...");
                System.out.println("Please, you must journey to Pax Bisonica and free our country!");
                System.out.println("1) Yes");
                System.out.println("2) No");
                int prompt3 = scan.nextInt();
                if (prompt3 == 1) {
                    System.out.println("Hooray!");
                }
                if (prompt3 == 2) {
                    System.out.println("Then all is lost...");
                }
            }
            if (prompt2 == 2) {
                System.out.println("Please, you must journey to Pax Bisonica and free our country!");
                System.out.println("1) Yes");
                System.out.println("2) No");
                int prompt4 = scan.nextInt();
                if (prompt4 == 1) {
                    System.out.println("Hooray!");
                }
                if (prompt4 == 2) {
                    System.out.println("Then all is lost...");
                }

            }
        }
        if (prompt1 == 2) {
            System.out.println("Ah, then goodbye...");
        }
    }
}
