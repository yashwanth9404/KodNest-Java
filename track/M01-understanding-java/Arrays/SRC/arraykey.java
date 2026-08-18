class Freq {
    int count =0;
    void count(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        System.out.println("Frequency of "+key+" is: "+count);
    }
}
public class arraykey{
    public static void main(String[] args) {
        int arr[] = {10,20,20,10,10,30};
        int key = 10;
        Freq f1 = new Freq();
        f1.count(arr,key);
    }
}