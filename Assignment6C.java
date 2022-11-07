
import java.util.Objects;
import java.util.Scanner;

public class Assignment6C {

    static void printArray(String c4[][]){
        for (int i = 0; i < c4.length; i++) {
            for (int j = 0; j < c4.length; j++) {
                System.out.print("|");
                System.out.print(c4[i][j]);
            }
            System.out.print("|");
            System.out.println("");
        }
    }
    static boolean isBoardFull(String c4[][]) {
        boolean isFull = true;
        for (int i = 0; i < c4.length; i++) {
            for (int j = 0; j < c4.length; j++) {
                if (c4[i][j] == " ") {
                    isFull = false;
                    break;
                }
            }
        }
        return isFull;
    }

    static void addDisc(String c4[][], String player, int column) {
        int lowestEmptySpace = 0;
        for (int i = 0; i < c4.length; i++) {
            /*if (c4[0][column] != " ") {
                System.out.print("Choose another row...");
            }
             */
            if (!Objects.equals(c4[i][column], " ")) {
                lowestEmptySpace = i-1;
                break;
            }
            else if (i == (c4.length - 1)) {
                lowestEmptySpace = c4.length - 1;
            }


        }
        c4[lowestEmptySpace][column] = String.valueOf(player);
    }
    static boolean winHorizontal(String c4[][], String player) {
        boolean boolWin = false;
        boolean win = true;
        for (int i = 0; i < c4.length; i++) {
            win = true;
            for (int j = 0; j < c4.length; j++) {
                if (!(c4[i][j].equals(player))) {
                    win = false;
                }
            }
            if (win) {
                boolWin = true;
                break;
            }
        }
        return boolWin;
    }
    static boolean winVertical(String c4[][], String player) {
        boolean boolWin = false;
        boolean win = true;
        for (int i = 0; i < c4.length; i++) {
            win = true;
            for (int j = 0; j < c4.length; j++) {
                if (!(c4[j][i].equals(player))) {
                    win = false;
                }
            }
            if (win) {
                boolWin = true;
                break;
            }
        }
        return boolWin;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String connectFour[][] = new String[4][4];
        for (int i = 0; i < connectFour.length; i++) {
            for (int j = 0; j < connectFour.length; j++) {
                connectFour[i][j] = " ";
            }
        }

        printArray(connectFour);

        while (true) {
            System.out.print("Player 1 enter a row: ");
            int player1row = scan.nextInt();
            addDisc(connectFour, "x", player1row);
            printArray(connectFour);
            if (isBoardFull(connectFour)) {
                System.out.println("The board is full");
                break;
            }
            if (winHorizontal(connectFour, "x")) {
                System.out.print("Player 1 wins!");
                break;
            }
            if (winVertical(connectFour, "x")) {
                System.out.print("Player 1 wins!");
                break;
            }
            System.out.print("Player 2 enter a row: ");
            int player2row = scan.nextInt();
            addDisc(connectFour, "o", player2row);
            if (isBoardFull(connectFour)) {
                System.out.println("The board is full");
                break;
            }
            printArray(connectFour);
            if (winHorizontal(connectFour, "o")) {
                System.out.print("Player 2 wins!");
                break;
            }
            if (winVertical(connectFour, "o")) {
                System.out.print("Player 2 wins!");
                break;
            }



        }





    }
}