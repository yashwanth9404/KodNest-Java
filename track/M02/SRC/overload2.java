class method {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add (double a,double b){
        return a+b;
    }
    double add (double a,double b, double c){
        return a+b+c;
    }
    double add(double a,int b){
        return a+b;
    }
    double add(int a,double b){
        return a+b;
    }
}
class overload2{
    public static void main(String[] args) {
        method m = new method();
        System.out.println("Addition: " + m.add(9,99));
        
    }
}