import java.util.Scanner;

public class Lab11B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean uppercase = false;
        boolean digit = false;

        System.out.print("Enter a password: ");
        String password = scan.next();

        for (int j = 0; j < password.length(); j++) {
            char currentChar = password.charAt(j);
            if (Character.isDigit(currentChar)) {
                digit = true;
            }
            if (Character.isUpperCase(currentChar)) {
                uppercase = true;
            }
            if (uppercase && digit) {
                if (password.length() >= 8) {
                    System.out.print("Valid broseph");
                }
                else {
                    System.out.print("Not valid broseph :(");
                }
                break;
            }
        }
    }
}
