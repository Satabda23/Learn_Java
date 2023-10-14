public class Recur_example {
    public static void main(String[] args) {
        int c = sumRec(4);
        System.out.println(c);
    }

    /*
     * how recursion works
     * sum(4) = 4 + sum(3)
     * sum(3) =4 + 3 + sum(2)
     * sum(2)= 4+3+2+1
     * thus, you can see it is calling itself
     */

//    base condition where the program had to stop otherwise it will go to infinite recursion
    static int sumRec(int n) {
        if (n == 1) {
            return 1;
        }

//        calling itself again and again
        return n + sumRec(n - 1);
    }
}
