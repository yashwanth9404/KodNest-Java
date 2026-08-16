import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read start and end values
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int evenSum = 0;
        int oddCount = 0;

        // Traverse the range from start to end (inclusive)
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum+i;
            } else {
                oddCount=oddCount+1;
            }
        }

        // Print results
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd count: " + oddCount);

        scanner.close();
    }
}