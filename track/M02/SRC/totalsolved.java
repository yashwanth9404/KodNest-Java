import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of days
        int practiceDays = scanner.nextInt();
        int total = 0;

        // Calculate the total
        for (int i = 1; i <=practiceDays; i++) {
            total = total+ scanner.nextInt();
        }

        // Display the total and the progress status
        System.out.println("Total solved: " + total);

        if (total >= 20) {
            System.out.println("Status: Strong progress");
        } else if (total >= 10) {
            System.out.println("Status: Keep improving");
        } else {
            System.out.println("Status: Needs more practice");
        }

        scanner.close();
    }
}