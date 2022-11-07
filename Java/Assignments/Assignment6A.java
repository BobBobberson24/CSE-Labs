import java.util.Scanner;
import java.util.Random;



public class Assignment6A {


    static void create_random_array(int intArray[]) {
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            intArray[i] = (rand.nextInt(1000)-500);
        }
    }

    static void sort_array(int intArray[]) {

        for (int i = 0; i < intArray.length - 1; i++) {
            int lowIndex = i;
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < intArray[lowIndex]) {
                    lowIndex = j;//searching for lowest index
                }
            }
            int smallerNumber = intArray[lowIndex];
            intArray[lowIndex] = intArray[i];
            intArray[i] = smallerNumber;
        }


    }

        /*for (int i = 0; i < 9; i++) {
            int lowNum = i;
            for (int j = i+1; j < 10; j++) {
                if (intArray[j] < intArray[i]) {
                    lowNum = j;
                }
            }
            int oldNum = intArray[i];
            intArray[i] = intArray[lowNum];
            intArray[lowNum] = oldNum;
        }

         */

    static void print_array(int intArray[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intArray[] = new int[10];
        boolean isSorted = false;
        create_random_array(intArray);
        System.out.println("[Is It Sorted]");
        System.out.print("Random Array:");
        print_array(intArray);
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1) Generate a random array");
            System.out.println("2) Is the array sorted?");
            System.out.println("3) Sort the array");
            System.out.println("4) Quit\n");
            System.out.print("Choice: ");
            int selection = scan.nextInt();
            if (selection == 1) {
                create_random_array(intArray);
                System.out.print("Random Array:");
                print_array(intArray);
                isSorted = false;
                System.out.println("");
            }
            if (selection == 2) {
                if (isSorted) {
                    System.out.println("The array is sorted");
                    System.out.println("");
                }
                else {
                    System.out.println("The array is not sorted");
                    System.out.println("");
                }
            }
            if (selection == 3) {
                sort_array(intArray);
                System.out.print("Sorted Array: ");
                print_array(intArray);
                System.out.println("");
                isSorted = true;
            }
            if (selection == 4) {
                break;
            }
            System.out.println("");


        }

    }
}
