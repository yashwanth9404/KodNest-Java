import java.util.Scanner;

public class targetArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the SIZE of Array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = scan.nextInt();
        
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        
        System.out.print("Reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        
        scan.close();
    }
}