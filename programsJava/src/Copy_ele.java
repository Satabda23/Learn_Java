

public class Copy_ele {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr = new int[arr1.length];


        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
            System.out.println(arr[i] + " ");
        }

    }
}
