import java.util.Scanner;

public class pgm3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
       
       System.out.println("Enter the elements: ");
       for (int i=0;i<size;i++){
        arr[i]= scan.nextInt();
        }
        for (int i=0;i<size;i++){
            System.out.println("The array elements are : " + (arr[i]));
        }
    }
}