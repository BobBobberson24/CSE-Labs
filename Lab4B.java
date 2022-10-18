package Lab4;
import java.util.Scanner;
public class Lab4B {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        while(true) {
            System.out.print("Enter the day: ");
            String day =  scan.nextLine();
            if (day.equals("Monday") || day.equals("Wednesday") || day.equals("monday") || day.equals("wednesday")) {
            System.out.println("I have class today");
            }
            if (day.equals("Friday") || day.equals("friday")) {
            System.out.println ("It's friday! Friday! Gotta get down on Friday!");
            }
            if (day.equals("Sunday") || day.equals("sunday") || day.equals("Tuesday") || day.equals("tuesday") || day.equals("Thursday") || day.equals("thursday") || day.equals("Saturday") || day.equals("saturday")) {
            System.out.println ("I should use this day to study.");
            }
        }

    }
}

