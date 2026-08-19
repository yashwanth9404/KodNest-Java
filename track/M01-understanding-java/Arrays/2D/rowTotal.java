import java.util.Scanner;

public class rowTotal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the Number of Rows: ");
        int r = scan.nextInt();
        System.out.print("Enter the Number of Columns: ");
        int c = scan.nextInt();
        
        int[][] matrix = new int[r][c];
        
        // Read matrix elements
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the row: " + (i+1) + " Coulumn: " + (j+1) + " Element");
                matrix[i][j] = scan.nextInt();
            }
        }
        
        // Calculate and print row totals
        for (int i = 0; i < r; i++) {
            int rowTotal = 0; // Reset for each row
            for (int j = 0; j < c; j++) {
                rowTotal += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " total: " + rowTotal);
        }
        
        scan.close();
    }
}