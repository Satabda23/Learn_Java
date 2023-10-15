public class Example_recur2 {
    public static void main(String[] args) {
        ascenOrder(1);
    }

    public static void ascenOrder(int n){

        if(n==6){
            return;
        }
        System.out.println(n);
        ascenOrder(n+1);
    }
}
