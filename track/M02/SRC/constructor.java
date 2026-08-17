import java.util.Scanner;

class Student {
    String name;

    Student(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class constructer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name
        String name = scanner.nextLine();

        // Create one Student object
        Student student = new Student(name);

        // Call display method
        student.display();

        scanner.close();
    }
}