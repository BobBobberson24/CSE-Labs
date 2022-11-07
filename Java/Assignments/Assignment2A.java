import java.util.Scanner;

public class Assignment2A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people are in your group? ");
        int people = scan.nextInt();
        System.out.print("How many groups do you want? ");
        int groups = scan.nextInt();
        int remainder = people % groups;
        System.out.println("If we divide " + people + " people in " + groups + " groups evenly, " + remainder + " person/people will be left without a group.");

    }

}
