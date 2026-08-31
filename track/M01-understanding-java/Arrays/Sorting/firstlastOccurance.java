import java.util.Scanner;

public class firstlastOccurance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size of the Array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the Elements of the Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        
        System.out.print("Enter the Target Value: ");
        int target = scan.nextInt();

        int first = -1;
        int last = -1;

        // Linear traversal to find first and last occurrence
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        // Print result
        System.out.println(first + " " + last);
        
        scan.close();
    }
}