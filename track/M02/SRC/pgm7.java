class Student {
    int id;
}

public class pgm7 {
    public static void main(String[] args) {
        Student first = new Student();
        first.id = 101;

        Student second = new Student();
        second.id = 202;

        Student selected = first;

        first = second;
        selected = second;

        System.out.println(first.id);
        System.out.println(second.id);
        System.out.println(selected.id);
    }
}