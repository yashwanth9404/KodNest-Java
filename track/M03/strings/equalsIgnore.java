import java.util.Scanner;

public class equalsIgnore{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter How Many Times You want to compare: ");
        int size = scan.nextInt();
        
        for(int i = 1; i<=size;i++){
            System.out.println("Comparison Number: " + i + "\n");
            scan.nextLine();

            System.out.println("Enter The First String: ");
            String name1 = scan.nextLine();

            System.out.println("Enter The Second String: ");
            String name2 = scan.nextLine();

            if (name1.equalsIgnoreCase(name2)) {
                System.out.println("Strings are equal");
            } else {
                System.out.println("Strings are not equal");
            }
        }
    
    }
}