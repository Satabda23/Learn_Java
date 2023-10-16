import java.util.Scanner;

public class Palindrome_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("no, it is not palindrome");
        }
    }

    public static boolean isPalindrome(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum * 10 + digit;
            n = n / 10;
        }

        return temp == sum;
    }
}
