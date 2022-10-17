import java.util.Scanner;

public class Lab8B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = scan.nextInt();

        int array[][] = new int[rows][columns];

        System.out.println("\nI have " + rows + " rows and " + columns + " columns. I need to fill-up " + rows*columns + " spaces.\n");
        System.out.println("The " + rows + "x" + columns + " array:");

        int rowCount = 0;
        int columnCount = 0;

        for (int i = 0; i < rows*columns; i++) {
            array[rowCount][columnCount] = (i + 1);
            columnCount++;
            if (columnCount == (columns)) {
                columnCount = 0;
                rowCount++;

            }
            if (rowCount == (rows)) {
                rowCount = 0;
                columnCount = 0;
                break;
            }
        }
        for (int i = 0; i < rows*columns; i++) {
            System.out.print(array[rowCount][columnCount] + "|");
            columnCount++;
            if (columnCount == (columns)) {
                columnCount = 0;
                rowCount++;
                System.out.println("");
            }
            if (rowCount == (rows)) {
                break;
            }
        }

    }
}
