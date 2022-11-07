import java.util.Scanner;

public class Assignment5A {
    public static void main(String[] args) {
        System.out.println("[Top 5 Friends List]");
        String array[] = new String[5];
        for (int i = 0; i < 5; i++) {
            array[i] = "";
        }
        int count = 0;

        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("What would you like to do? ");
            System.out.println("1) Enter a friend's name");
            System.out.println("2) Replace a friend's name");
            System.out.println("3) Display your friends list");
            System.out.println("4) Quit");
            System.out.print("Your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();


            if (choice == 1) {
                boolean duplicate = true;
                System.out.print("Enter a friend's name");
                String name = scan.nextLine();
                for (int i = 0; i < 5; i++) {
                    if (array[i].equals(name)) {
                        System.out.print("Sorry, they're already on the list!");
                        duplicate = false;
                        break;
                    }
                }
                if (!duplicate) {
                    array[count] = name;
                }
                count++;
            }

            if (choice == 3) {
                System.out.println("Friends List:");
                for (int i = 0; i < 5; i++) {
                    System.out.println((i + 1) + " " + array[i]);

                }
            }

        }
    }
}
