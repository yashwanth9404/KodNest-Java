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
    void drink(){
        System.out.println("Drinking...");
    }
}

public class object2 {
    public static void main(String[] args) {
        Course java = new Course();
        java.code = "CB.EN.U4ECE22262";
        java.studentName = "Katika Uday";
        java.fee = 1000000;

        Course python = new Course();
        python.code = "CS256";
        python.studentName = "Yashwanth";
        python.fee = 500000;

        System.out.println("\n" + "Student Name: " + java.studentName);
        System.out.println("Course Code: " + java.code);
        System.out.println("Fee: " + java.fee);
        java.eat();
        java.sleep();
        java.drink();

        System.out.println("\n"+"Student Name: " +python.studentName);
        System.out.println("Course Code: " + python.code);
        System.out.println("Fee Paid: " + python.fee);

        python.eat();
        python.sleep();
        python.drink();

    }
}