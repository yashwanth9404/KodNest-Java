import java.util.Scanner;
public class palindrome{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the size of Array:");
        int size = scan.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the Elements of Array:");
        for (int i =0;i<size;i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0;i<size/2;i++){
            if(arr[i] != arr[size-1-i]) {
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("A Palindrome");
    }
}