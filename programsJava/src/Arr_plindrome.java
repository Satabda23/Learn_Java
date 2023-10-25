public class Arr_plindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        int n = arr.length;

        boolean paldm = true;
        int j = n-1;

        for(int i=0; i<n/2; i++){
            if(arr[i]!=arr[j]){
                paldm = false;
                break;
            }
            else{
                j--;
            }
        }
        System.out.println(paldm);
    }


}
