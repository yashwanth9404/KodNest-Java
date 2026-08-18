public class arrayAssign {
    public static void main(String[] args) {
        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;

        // 1. Create snapshot array with the same length
        int[] snapshot = new int[readings.length];

        // 2. Copy values element-by-element
        for (int i = 0; i < readings.length; i++) {
            snapshot[i] = readings[i];
        }

        // 3. Update the original array
        readings[updateIndex] = newValue;

        // 4. Print snapshot
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }

        System.out.println();

        // 5. Print updated readings
        System.out.print("Updated: ");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(readings[i] + " ");
        }
    }
}