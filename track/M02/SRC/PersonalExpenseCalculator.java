import java.util.Scanner;

public class PersonalExpenseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read income and expenses
        double monthlyIncome = scanner.nextDouble();
        double rentExpense = scanner.nextDouble();
        double foodExpense = scanner.nextDouble();
        double travelExpense = scanner.nextDouble();

        // Calculate total expense and remaining amount
        double totalExpense = rentExpense + foodExpense + travelExpense;
        double remainingAmount = monthlyIncome - totalExpense;

        // Display results
        System.out.println("Total expense: " + totalExpense);
        System.out.println("Remaining: " + remainingAmount);

        // Determine budget status
        if (remainingAmount >= 0) {
            System.out.println("Status: Within budget");
        } else {
            System.out.println("Status: Over budget");
        }

        scanner.close();
    }
}