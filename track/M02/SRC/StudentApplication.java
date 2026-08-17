import java.util.Scanner;
class Student {
    String name;
    int age;
    double height;

    void input(String name,int age,double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    void display(){
        System.out.println("Your Name is:" + name);
        System.out.println("Your Age is:"+ age);
        System.out.println("Your Height is:" + height);
    }
}

 class StudentApplication{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = scan.nextLine();
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Enter your height: ");
        double height = scan.nextDouble();

        Student s1 = new Student();
        s1.input(name, age, height);
        s1.display();
        scan.close();
    }
}