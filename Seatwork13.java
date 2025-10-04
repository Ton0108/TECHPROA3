import java.util.Scanner;

public class SeatworkThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Grade by percentage
        System.out.print("Enter percentage score: ");
        double percent = scanner.nextDouble();
        System.out.println("Grade: " + calculateGrade(percent));

        // Example 2: Grade by raw score
        System.out.print("Enter raw score: ");
        int score = scanner.nextInt();
        System.out.print("Enter maximum score: ");
        int max = scanner.nextInt();
        System.out.println("Grade: " + calculateGrade(score, max));

        // Example 3: Grade by multiple subjects
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        double[] subjects = new double[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextDouble();
        }

        System.out.println("Final Grade: " + calculateGrade(subjects));
    }

    // Method for percentage
    public static String calculateGrade(double percent) {
        if (percent >= 90) return "A";
        else if (percent >= 80) return "B";
        else if (percent >= 70) return "C";
        else if (percent >= 60) return "D";
        else return "F";
    }

    // Method for raw score
    public static String calculateGrade(int score, int max) {
        double percent = (double) score / max * 100;
        return calculateGrade(percent);
    }

    // Method for multiple subjects
    public static String calculateGrade(double[] scores) {
        double sum = 0;
        for (double s : scores) {
            sum += s;
        }
        double average = sum / scores.length;
        return calculateGrade(average);
    }
}