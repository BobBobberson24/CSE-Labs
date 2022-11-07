import java.util.Scanner;

public class Assignment3C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("[App Checklist]");
        System.out.print("What mobile device do you have? ");
        String device = scan.next();
        if (device.equals("Apple") || device.equals("apple")) {
            System.out.print("What version do you have? ");
            int appleVersion = scan.nextInt();
            if (appleVersion >= 12) {
                System.out.println("Does your device support bluetooth connections? ");
                String bluetooth = scan.next();
                if (bluetooth.equals("Yes") || bluetooth.equals("yes")) {
                    System.out.println("Congratulations, you can run the app!");
                }
                if (bluetooth.equals("No") || bluetooth.equals("no")) {
                    System.out.println("Sorry, our app does not support your device.");
                }
            }



        }
        if (device.equals("Android") || device.equals("android")) {
            System.out.print("What version do you have? ");
            int androidVersion = scan.nextInt();
            if (androidVersion >= 11) {
                System.out.println("Does your device support bluetooth connections? ");
                String bluetooth = scan.next();
                if (bluetooth.equals("yes") || bluetooth.equals("yes")) {
                    System.out.println("Congratulations, you can run the app!");
                    if (bluetooth.equals("No") || bluetooth.equals("no")) {
                        System.out.println("Sorry, our app does not support your device.");
                    }
                }


            }

        }
    }
}
