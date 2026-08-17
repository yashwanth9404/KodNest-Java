import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    // Set Basic and 199
    MobilePlan() {
        planName = "Basic";
        price = 199;
    }

    // Store both received values
    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class constructorOverload2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read selected plan name and price
        String planName = scanner.nextLine();
        int price = scanner.nextInt();

        // Create default and selected plans
        MobilePlan defaultPlan = new MobilePlan();
        MobilePlan selectedPlan = new MobilePlan(planName, price);

        // Display both plans
        defaultPlan.display();
        selectedPlan.display();

        scanner.close();
    }
}