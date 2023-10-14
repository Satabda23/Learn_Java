public class Fibbo_recur {
    public static void main(String[] args) {
        int c = Fibo(6);
        System.out.println(c);
    }
    static int Fibo(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;

        } else {
            return Fibo(n - 1) + Fibo(n - 2);
        }
    }
}

//Fibo(6) calls Fibo(5) and Fibo(4).
//Fibo(5) calls Fibo(4) and Fibo(3).
//Fibo(4) calls Fibo(3) and Fibo(2).
//Fibo(3) calls Fibo(2) and Fibo(1).
//Fibo(2) returns 1.
//Fibo(1) returns 0.

//Now, we can start calculating the Fibonacci numbers bottom-up:
//
//Fibo(2) + Fibo(1) returns 1 + 0, which is 1.
//Fibo(3) returns Fibo(2) + Fibo(1), which is 1 + 0, which is 1.
//Fibo(4) returns Fibo(3) + Fibo(2), which is 1 + 1, which is 2.
//Fibo(5) returns Fibo(4) + Fibo(3), which is 2 + 1, which is 3.
//Fibo(6) returns Fibo(5) + Fibo(4), which is 3 + 2, which is 5.
