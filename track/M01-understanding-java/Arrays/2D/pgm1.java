import java.util.Scanner;

public class pgm1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int r = scan.nextInt();
        System.out.print("Enter the Number of Columns: ");
        int c = scan.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter the Elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               System.out.print("Enter Element at (" + (i + 1) + ", " + (j + 1) + "): ");
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("The 2D Matrix Is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}