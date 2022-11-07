import java.util.Scanner;

public class Assignment1B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your average lab grade: ");
        double labAvg = scan.nextFloat();
        System.out.print("Enter your average assignment grade: ");
        double assAvg = scan.nextFloat();
        System.out.print("Enter your midterm exam grade: ");
        double mExam = scan.nextFloat();
        System.out.print("Enter your final exam grade: ");
        double fExam = scan.nextFloat();
        double labAvgWeighted = (labAvg * .1);
        double assAvgWeighted = (assAvg * .4);
        double mExamWeighted = (mExam *  .2);
        double fExamWeighted = (fExam * .3);
        double finalGrade = (fExamWeighted + mExamWeighted + assAvgWeighted + labAvgWeighted);





        System.out.println("Your weighted lab average is " + labAvgWeighted);
        System.out.println("Your weighted assignment average is " + assAvgWeighted);
        System.out.println("Your weighted midterm exam is " + mExamWeighted);
        System.out.println("Your weighted final exam is " + fExamWeighted);
        System.out.println("Your final CSE1321L grade is " + finalGrade);



    }


}
