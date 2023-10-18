public class Max_min_aver {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8, 56};
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(aver(arr));
    }

    static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
               min = a[i];
            }
        }
        return min;
    }

    static int aver(int[] a) {
        int aver = 0;
        for (int i = 0; i < a.length; i++) {
            aver = aver + a[i];
        }

        return aver / a.length;
    }
}

