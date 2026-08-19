import java.util.Scanner;

public class pgm3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of products: ");
        int products = scanner.nextInt();
        System.out.println("Enter the no. of months: ");
        int months = scanner.nextInt();
        int[][] sales = new int[products][months];

        for (int product = 0; product < products; product++) {
            System.out.println("Enter the elements of row " + (product + 1) + "," + (months) + "): ");
            for (int month = 0; month < months; month++) {
                sales[product][month] = scanner.nextInt();
            }
        }

        for (int product = 0; product < products; product++) {
            int productTotal = 0;

            for (int month = 0; month < months; month++) {
                productTotal = productTotal + sales[product][month];
            }

            System.out.println("Product " + (product + 1) + " total: " + productTotal);
        }

        scanner.close();
    }
}