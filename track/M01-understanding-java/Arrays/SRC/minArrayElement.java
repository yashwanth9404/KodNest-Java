import java.util.Scanner;

public class minArrayElement {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the Size of Array: ");
       int size = scan.nextInt();
       int arr[] = new int[size];
       int min = arr[0];

      System.out.println("Enter the Elements of array: ");
      for(int i=0;i<size;i++){
        arr[i] = scan.nextInt();
        if(arr[i]<min) {
            min = arr[i];
        }
      }
      System.out.println("Minimum Element is: " + min);
    }
}