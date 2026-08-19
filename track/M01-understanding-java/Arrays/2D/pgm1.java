import java.util.Scanner;

public class pgm1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int r = scan.nextInt();
        System.out.print("Enter the Number of Columns: ");
        int c = scan.nextInt();

        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the row: " + (i+1) + " Coulumn: " + (j+1) + " Element");
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