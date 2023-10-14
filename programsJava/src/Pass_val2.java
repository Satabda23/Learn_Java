
// shows how you can change value of an array using the concept of pass by value

import java.util.Arrays;

public class Pass_val2 {
    public static void main(String[] args) {
        int[] arr = {2,45,67,8};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 99;
    }
}
