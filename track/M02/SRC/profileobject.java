import java.util.Scanner;

class Learner {
    int id;
    String name;
    int javaScore;
}

public class profileobject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read first learner details
        Learner l1 = new Learner();
        l1.id = scan.nextInt();
        l1.name = scan.next();
        l1.javaScore = scan.nextInt();

        // Read second learner details
        Learner l2 = new Learner();
        l2.id = scan.nextInt();
        l2.name = scan.next();
        l2.javaScore = scan.nextInt();

        // Read updated score for first learner
        int newFirstScore = scan.nextInt();

        // Print before update
        System.out.println("Before Update");
        System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
        System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);

        // Update first learner's score
        l1.javaScore = newFirstScore;

        // Print after update
        System.out.println("After Update");
        System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
        System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);
    }
}