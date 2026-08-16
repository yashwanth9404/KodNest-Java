import java.util.Scanner;

class Student {
    String name;

    void setName(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void displayName() {
        // Print the stored name
        System.out.println("Student Name: " + this.name);
    }
}

public class newThis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name
        String name = scanner.nextLine();

        // Create one Student object
        Student student = new Student();

        // Call setName and displayName
        student.setName(name);
        student.displayName();

        scanner.close();
    }
}