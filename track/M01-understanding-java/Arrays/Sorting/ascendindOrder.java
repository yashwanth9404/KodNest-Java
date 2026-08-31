import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size of the Array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the Elements of the Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        // Track if sorted (1 for true, 0 for false)
        int sorted = 1;

        // Check adjacent pairs
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = 0;
                break;
            }
        }

        if(sorted == 1){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        scan.close();
    }
}