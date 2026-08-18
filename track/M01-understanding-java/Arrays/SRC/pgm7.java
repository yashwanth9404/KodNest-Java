public class pgm7 {
    public static void main(String[] args) {
        int[] stock = {4, 12, 2, 9, 5};
        int reorderLevel = 5;
        int reorderCount = 0;

        for (int index = 0; index < stock.length; index++) {
            if (stock[index] <= reorderLevel) {
                reorderCount++;
            }
        }

        System.out.println("Items to reorder: " + reorderCount);
    }
}