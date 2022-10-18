package Lab4;

import java.util.Scanner;


public class Lab4A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the score of your exam: ");
        double score = scan.nextDouble();
        String letterGrade = "lettergrade";
        if (score <= 64) {
            letterGrade = "F";
        }
        if (score >= 65 && score <= 67) {
            letterGrade = "D-";
        }
        if (score >= 68 && score <= 70) {
            letterGrade = "D";
        }
        if (score >= 71 && score <= 73) {
            letterGrade = "D+";
        }
        if (score >= 74 && score <= 76) {
            letterGrade = "C-";
        }
        if (score >= 77 && score <= 79) {
            letterGrade = "C";
        }
        if (score >= 80 && score <= 82) {
            letterGrade = "C+";
        }
        if (score >= 83 && score <= 85) {
            letterGrade = "B-";
        }
        if (score >= 86 && score <= 88) {
            letterGrade = "B";
        }
        if (score >= 89 && score <= 91) {
            letterGrade = "B+";
        }
        if (score >= 92 && score <= 94) {
            letterGrade = "A-";
        }
        if (score >= 95 && score <= 97) {
            letterGrade = "A";
        }
        if (score > 98) {
            letterGrade = "A+";
        }
        System.out.println(letterGrade);
    }
}
