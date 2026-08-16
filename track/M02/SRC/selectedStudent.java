import java.util.Scanner;

class Student {
    int registrationId;
    String name;
    double attendancePercentage;
}

public class selectedStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first student details
        Student s1 = new Student();
        s1.registrationId = scanner.nextInt();
        s1.name = scanner.next();
        s1.attendancePercentage = scanner.nextDouble();

        // Read second student details
        Student s2 = new Student();
        s2.registrationId = scanner.nextInt();
        s2.name = scanner.next();
        s2.attendancePercentage = scanner.nextDouble();

        // Read target ID and updated attendance
        int targetId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        // Reference to the selected student
        Student selectedStudent = null;

        if (s1.registrationId == targetId) {
            selectedStudent = s1;
        } else if (s2.registrationId == targetId) {
            selectedStudent = s2;
        }

        // Apply update or report not found
        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        // Display both student records
        System.out.println(s1.registrationId + " - " + s1.name + " - " + s1.attendancePercentage + "%");
        System.out.println(s2.registrationId + " - " + s2.name + " - " + s2.attendancePercentage + "%");

        scanner.close();
    }
}