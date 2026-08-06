public class nestedpgm1 {
    public static void main(String[] args) {

        for(int i=1;i<=3;i++){

            for(int j=1;j<=5;j++){

            if (j==4) {
                continue;
            }
                System.out.println("i: "+i + " , "  +  "j:"+j);
            
            }
            System.out.println();
        }
        
    }
}