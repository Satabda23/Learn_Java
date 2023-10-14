public class Prime_num {
    public static void main(String[] args) {
        primeBet(10, 30);
    }

    // if the no is 10, we check it till 5. Because if the no gets bigger than 5, the multiple will get lower than 2
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeBet(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
