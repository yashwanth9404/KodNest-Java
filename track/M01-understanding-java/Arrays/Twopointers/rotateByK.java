import java.util.Scanner;

public class rotateByK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size = scan.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter the Elements of an Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        
        System.out.println("Enter the no. of rotations required:");
        int k = scan.nextInt();
        k = k % size;
        
        reverse(arr, 0, k - 1);
        reverse(arr, k, size - 1);
        reverse(arr, 0, size - 1);
        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + (i == size - 1 ? "" : " "));
        }
    }
    
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}