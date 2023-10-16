import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return temp == sum;
    }
}
