import java.util.Scanner;
public class rotateAntiClock {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements of the Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        int lastElement = arr[size-1];
       for (int i= size-1;i>0;i--){
            arr[i] = arr[i-1];
       }
       arr[0] = lastElement;
       for (int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
       }          
    }
}
