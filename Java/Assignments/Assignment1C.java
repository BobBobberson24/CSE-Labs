import java.util.Scanner;

public class Assignment1C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;

        System.out.println("Enter a letter here: ");
        char letter = scan.next().charAt(0);
        System.out.print("The next 3 letters are: ");
        while (i < 4) {
            char outLetter = (char) (letter + i);
            if (i < 3) {
                System.out.print(outLetter + ", ");
            }

            if (i == 3) {
                System.out.print(outLetter);
            }
            i++;


        }
    }
}