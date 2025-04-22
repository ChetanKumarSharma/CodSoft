import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSubjects = 5;
        double totalMarks = 0;
        System.out.println("Enter marks out of 100 for " + totalSubjects + " subjects:");
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = input.nextDouble();
            totalMarks += marks;
        }
        double averagePercentage = (totalMarks / (totalSubjects * 100)) * 100;
        String grade = "";
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("\nTotal Marks: " + totalMarks + " out of " + (totalSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Made By Chetan Kumar Sharma");
        input.close();
    }
}
