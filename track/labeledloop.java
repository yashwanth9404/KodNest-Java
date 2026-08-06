public class labeledloop {
    public static void main(String[] args) {

    Outer : for(int i=1;i<=5;i++) {
       
       inner: for(int j=1;j<=5;j++) {
            if(i==3){
                break Outer;
            }
            System.out.println("i:"+i+  " , j:"+j);
        }
    }    
    
    }
}