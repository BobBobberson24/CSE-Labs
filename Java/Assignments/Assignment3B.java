import java.util.Scanner;

public class Assignment3B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String belt = "";
        int stripes = 0;
        int noBelt = 0;
        System.out.println("[Martial Arts Belt]");
        System.out.print("What belt grade are you?");
        int grade = scan.nextInt();
        switch(grade) {
            case 10: belt = "white";
                     stripes = 0;
                     break;
            case 9: belt = "white";
                    stripes = 1;
                    break;
            case 8: belt = "yellow";
                    stripes = 1;
                    break;
            case 7: belt = "yellow";
                    stripes = 2;
                    break;
            case 6: belt = "blue";
                    stripes = 1;
                    break;
            case 5: belt = "blue";
                    stripes = 2;
                    break;
            case 4: belt = "green";
                    stripes = 1;
                    break;
            case 3: belt = "green";
                    stripes = 2;
                    break;
            case 2: belt = "brown";
                    stripes = 1;
                    break;
            case 1: belt = "brown";
                    stripes = 2;
                    break;
            case 0: belt = "black";
                    stripes = 0;
                    break;
            default: noBelt = 1;
                     break;
        }

        if (noBelt == 0){
            System.out.println("You have a " + belt + " belt, with " + stripes + " stripes!");
        }
        else {
            System.out.println("You have no belt...");
        }
    }
}
