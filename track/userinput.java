
import java.util.Scanner;


public class userinput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter Age : ");
        int age = scan.nextInt();
        System.out.println("Your age : " + age);
               
        System.out.println("Enter you Height :");
        Float height = scan.nextFloat();
        System.out.println("Your height : " + height);
      

        scan.nextLine();
        System.out.println("Enter you Full Name:");
        String fname = scan.nextLine();
        System.out.println("Your Full Name : " + fname);
    }
}