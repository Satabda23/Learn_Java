import java.util.Scanner;

public class Autobiographical_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());

//        first line: convert int to string
//        sec line: create an array of str length

        String str = String.valueOf(n);
        int[] arr = new int[str.length()];

//        finding out the digits and storing it in the array
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n = n / 10;
        }

//        main driver code for autobiographical no which counts the digits in the array
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int k : arr) {
                if (i == k) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
