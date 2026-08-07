import java.util.Scanner;
public class pgm6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Byte Value");
        byte b = scan.nextByte();
        System.out.println(" Byte Value : " + b);
        System.out.println("");

        System.out.println("Enter Short Value");
        short s = scan.nextShort();
        System.out.println(" Short Value : " + s);
        System.out.println("");

        System.out.println("Enter Int Value");
        int i = scan.nextInt();
        System.out.println(" Int Value : " + i);
        System.out.println("");

        System.out.println("Enter Long Value");
        long l = scan.nextLong();
        System.out.println(" Long Value : " + l);
        System.out.println("");

        System.out.println("Enter Float Value");
        float f = scan.nextFloat();
        System.out.println(" Float Value : " + f);
        System.out.println("");

        System.out.println("Enter Double Value");
        double d = scan.nextDouble();
        System.out.println(" Double Value : " + d);
        System.out.println("");

        System.out.println("Enter Boolean Value");
        boolean bool = scan.nextBoolean();
        System.out.println(" Boolean Value : " + bool);
        System.out.println("");

        scan.close();
        
    }
}
