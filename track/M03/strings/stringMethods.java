
public class stringMethods {

    public static void main(String[] args) {
        String s1 = "Samsung Electronics";

        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(10));
        System.out.println(s1.indexOf('s'));
        System.out.println(s1.lastIndexOf('s'));
        System.out.println(s1.substring(0, 3));
        System.out.println(s1.substring(7));
        System.out.println(s1.replace('s', 'S'));
        System.out.println(s1.replace("Samsung", "Srinivas"));
        System.out.println(s1.replaceFirst("s", "S"));
        System.out.println(s1.replaceAll("s", "S"));
        System.out.println(s1.trim());
        System.out.println(s1.startsWith("Samsung"));
        System.out.println(s1.endsWith("Electronics"));
        System.out.println(s1.contains("Samsung"));
        System.out.println(s1.isEmpty());
        System.out.println(s1.length());
    }
}
