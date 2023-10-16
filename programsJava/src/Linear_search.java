public class Linear_search {
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 56, 7};
        int a = 4;
        boolean res = linearSrh(num, a);
        System.out.println(res);
    }

    static boolean linearSrh(int[] arr, int target) {
        for (int a : arr) {
            if (a == target) {
                return true;
            }
        }
        return false;
    }
}
