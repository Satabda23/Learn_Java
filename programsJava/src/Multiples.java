
// write the first multiples of 10 and display it in the form of 2 * 1 .....2*10
// hint: n is greater than 2 and less than 20, and  goes from 1 to 10

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiply(n);
        sc.close();
    }

    static void multiply(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }

    }
}
