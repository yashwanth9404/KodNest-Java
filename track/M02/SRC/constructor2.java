import java.util.Scanner;

class product {
    String name;
    double price; // Must be double, not int

    product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class constructor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double price = scan.nextDouble();

        product p1 = new product(name, price);
        p1.display();

        scan.close();
    }
}