import java.util.Scanner;

public class pgm2 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the strings:");

    String name1 = scan.nextLine();
    String name2 = scan.nextLine();

    if(name1.equals(name2)){
        System.out.println("Same");
    }else{
        System.out.println("not same");
    }
    
    }
}