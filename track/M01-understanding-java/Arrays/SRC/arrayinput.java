
import java.util.Scanner;

public class arrayinput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = 5;
        int[] arr = new int[size];
        int total = 0;

        System.out.println("Enter the 5 integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
            total += arr[i];
        }

        System.out.println("Sum of " + size + " integers is: " + total);
        scan.close();
    }
}
