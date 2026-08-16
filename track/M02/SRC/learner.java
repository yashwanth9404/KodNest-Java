import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read learner details
        String fullName = scanner.nextLine();
        int practiceDays = scanner.nextInt();
        int solvedProblems = 0;

        // Read daily solved problem counts
        for (int i = 0; i < practiceDays; i++) {
            solvedProblems += scanner.nextInt();
        }

        // Calculate decimal daily average
        double average = (double) solvedProblems / practiceDays;

        // Print progress summary
        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + solvedProblems);
        System.out.println("Daily average: " + average);

        // Determine status
        if (average >= 5.0) {
            System.out.println("Status: Consistent");
        } else {
            System.out.println("Status: Needs consistency");
        }

        scanner.close();
    }
}