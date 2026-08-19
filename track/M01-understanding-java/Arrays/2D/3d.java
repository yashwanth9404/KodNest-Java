import java.util.Scanner;

public class pgm1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Blocks: ");
        int b = scan.nextInt();
        System.out.print("Enter the Number of Rows: ");
        int r = scan.nextInt();
        System.out.print("Enter the Number of Columns: ");
        int c = scan.nextInt();

        int arr[][][] = new int[b][r][c];

        System.out.println("Enter the Elements: ");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print("Enter Element at (" + (i + 1) + ", " + (j + 1) + ", " + (k + 1) + "): ");
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }
        System.out.println("The 3D Matrix Is: ");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}