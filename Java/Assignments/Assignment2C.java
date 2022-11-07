import java.util.Scanner;

public class Assignment2C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("[Bisonica currency exchange]");
        System.out.println("General Bison welcomes you to Pax Bisonica!");
        System.out.println("");
        System.out.print("How many US dollars do you have? ");
        int USD = scan.nextInt();
        float BPD = (float) (USD * 0.85);
        float bisonDollars = BPD/5;
        System.out.println("");
        System.out.println(USD + " US Dollar(s) is " + BPD + " British Pound(s),");
        System.out.println("Which is worth " + String.format("%.2f", bisonDollars) + " Bison Dollar(s)!");
    }
}


