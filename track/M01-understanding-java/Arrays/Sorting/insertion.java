import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the Size of the Array: ");
        int size  = scan.nextInt();        
        int[] arr = new int[size];

        System.out.println("Enter the Elements of the Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
       System.out.println("Enter the index to insert: ");
       int index = scan.nextInt();

       System.out.println("Enter the element to insert: ");
       int element = scan.nextInt();
       
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
        }
        else{
          int arr2[] = new int[size+1];
          for (int i=0;i<size;i++){
            arr2[i] = arr[i];
          }
          arr2[index] = element;
          for (int i=index;i<size;i++){
            arr2[i+1] = arr[i];
          }
          for (int i=0;i<size+1;i++){
            System.out.print(arr2[i]+" ");
          }
        }

    }
}