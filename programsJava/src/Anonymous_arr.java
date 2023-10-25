// An array in Java without any name is known as an anonymous array. It is an array just for creating and using instantly.
public class Anonymous_arr {
    public static void main(String[] args) {
        printArray(new int[]{1, 4, 5, 67});
    }

    static void printArray(int[] a) {
        int total = 0;
        for (int i : a) {
            total = total + i;
        }
        System.out.println(total);
    }
}
