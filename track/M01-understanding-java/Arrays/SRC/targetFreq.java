import java.util.Scanner;

public class targetFreq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the SIZE of Array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the Target: ");
        int target = scan.nextInt();
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Frequency of " + target + ": " + count);
        
        scan.close();
    }
}