import java.util.Scanner;

public class greaterThanAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size of the Array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        long sum = 0;

        System.out.println("Enter the Elements of the Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / size;
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > average) {
                count++;
            }
        }

        System.out.println(count);
        
        scan.close();
    }
}