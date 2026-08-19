import java.util.Scanner;

public class pgm4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1D Array Input and Sum
        int size = scan.nextInt();
        int[] numbers = new int[size];
        int arrayTotal = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
            arrayTotal += numbers[i];
        }

        // 2D Matrix Input and Sum
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] matrix = new int[r][c];
        int matrixTotal = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scan.nextInt();
                matrixTotal += matrix[i][j];
            }
        }

        // Output Results
        System.out.println("Array total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);

        scan.close();
    }
}