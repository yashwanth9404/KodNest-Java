import java.util.Scanner;

class FoodOrder {
    String item;
    int quantity;

    // Constructor with 1 parameter
    FoodOrder(String item) {
        this.item = item;
        this.quantity = 1;
    }

    // Constructor with 2 parameters
    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class constructorOverload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the item and quantity
        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        // Create orders
        FoodOrder o1 = new FoodOrder(item);
        FoodOrder o2 = new FoodOrder(item, quantity);

        // Display both orders
        o1.display();
        o2.display();

        scanner.close();
    }
}