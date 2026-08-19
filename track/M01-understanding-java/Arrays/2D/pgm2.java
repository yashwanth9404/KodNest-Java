import java.util.Scanner;

public class pgm2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        int r = scan.nextInt();
        System.out.println("Enter the no. of columns: ");
        int c = scan.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the elements of row " + "(" + (i + 1) + "," + (j + 1) + "): ");
                arr[i][j] = scan.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 0) {
                    count++;
                }
            }
        }

        System.out.println("Available seats: " + count);

        scan.close();
    }
}