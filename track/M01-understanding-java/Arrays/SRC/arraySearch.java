class ArraySearch{
    void search(int ref[],int key){
        boolean found = false;
        for (int i =0;i<ref.length;i++){
            if(ref[i] == key){
                System.out.println("Element is present at index: "+i);
                found = true;
                break;
            } 
        }
        if(found == false ){
            System.out.println("Element is not present in array");
        }
    }
}

public class arraySearch {
    public static void main(String[] args) {
       int arr[] ={10,20,30,40,50};
       int key = 40;
       ArraySearch s1 = new ArraySearch(); 
       s1.search(arr,key);
    }
}