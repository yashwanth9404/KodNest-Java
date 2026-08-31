import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size of the Array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the Elements of the Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > highest) {
                second = highest;
                highest = arr[i];
            } else if (arr[i] < highest && arr[i] > second) {
                second = arr[i];
            }
        }
    
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct value");
        } else {
            System.out.println(second);
        }

        scan.close();
    }
}