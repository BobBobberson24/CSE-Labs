import java.util.Scanner;

public class Assignment4C {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("[Backspace Animation]");
        System.out.print("Please enter your sentence: ");
        String sentence = scan.nextLine();
        System.out.print("How many letters do you want to backspace? ");
        int backspaceAmt = scan.nextInt();
        System.out.print(sentence);
        Thread.sleep(650); //I added this because I didn't like how it started backspacing immediately even though it isn't a part of the assignment
        for (int i = 0; i < backspaceAmt; i++) {
            System.out.print("\b");
            Thread.sleep(500);
        }
    }
}
