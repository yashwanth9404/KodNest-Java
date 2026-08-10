class Course {
    String code;
    String studentName;
    int fee;
    void eat(){
        System.out.println("Eating...");
    }
    void sleep(){
        System.out.println("Sleeping...");
    }
}

public class object {
    public static void main(String[] args) {
        Course java = new Course();
        java.code = "CB.EN.U4ECE22262";
        java.studentName = "Katika Uday";
        java.fee = 1000000;

        System.out.println("Student Name: " + java.studentName);
        System.out.println("Course Code: " + java.code);
        System.out.println("Fee: " + java.fee);
        java.eat();
        java.sleep();
    }
}