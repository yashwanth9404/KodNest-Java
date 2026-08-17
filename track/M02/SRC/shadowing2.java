import java.util.Scanner;

class Student {
    String name;
    void setName(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void showName() {
        // Print the stored name
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        // Print the first score
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        // Print the total of two scores
        int total = first + second;
        System.out.println("Two-Score Total: " + total);
    }
}

public class shadowing2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();

        Student student = new Student();
        student.setName(name);
        student.showName();
        student.showScore(score1);
        student.showScore(score1, score2);

        sc.close();
    }
}