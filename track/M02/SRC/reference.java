class EmpApplication{
    int id ;
    String name;
    int age;
    int sal;
}

public class reference {
    public static void main(String[] args) {
        
        EmpApplication p1 = new EmpApplication();
        p1.id = 22262;
        p1.name = "Uday Katika";
        p1.age = 22;
        p1.sal = 500000000;
        System.out.println("\n"+ p1.id);
        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println(p1.sal);

        EmpApplication p2 = p1;
        p2.id = 56564545;
        p2.name = "Yashwanth";
        p2.age = 22;

        System.out.println("\n" + p2.id);  
        System.out.println(p2.age);
        System.out.println(p2.name);
        System.out.println(p1.sal);

        EmpApplication p3 = p2;
        p3.name = "Golla Karthik";
        p3.age = 23;
        p3.id = 6031347;
        System.out.println("\n" + p3.id);  
        System.out.println(p3.age);
        System.out.println(p3.name);
        System.out.println(p1.sal);
    }
}
