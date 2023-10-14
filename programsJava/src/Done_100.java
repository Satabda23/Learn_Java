
//reads a sequence of integers from the user and stops displaying "done" when the sum of these values exceeds 100.

import java.util.Scanner;

public class Done_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

//        this will keep asking input until if condition is not meet
        while (true) {
            System.out.println("enter a number");
            sum = sum + sc.nextInt();

            if (sum > 100) {
                break;
            }
        }
        System.out.println("done: " + sum);
        sc.close();

    }
}
