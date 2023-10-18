import java.util.Scanner;

public class User_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("please enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("the elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}
