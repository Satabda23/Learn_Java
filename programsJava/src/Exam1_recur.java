public class Exam1_recur {
    public static void main(String[] args) {
        printNum(6);
    }

    public static void printNum(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        printNum(n-1);
    }
}
