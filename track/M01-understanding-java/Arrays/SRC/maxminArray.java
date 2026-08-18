import java.util.Scanner;

public class maxminArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];

        // 1. Read all elements first
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        // 2. Initialize min and max after array is populated
        int min = arr[0];
        int max = arr[0];

        // 3. Compare with the remaining elements
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 4. Print results
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}