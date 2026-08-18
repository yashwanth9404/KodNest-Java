import java.util.Scanner;

public class maxArrayElement {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the Size of Array: ");
       int size = scan.nextInt();
       int arr[] = new int[size];
       int max = arr[0];

      System.out.println("Enter the Elements of array: ");
      for(int i=0;i<size;i++){
        arr[i] = scan.nextInt();
        if(arr[i]>max) {
            max = arr[i];
        }
      }
      System.out.println("Maximum Element is: " + max);
    }
}