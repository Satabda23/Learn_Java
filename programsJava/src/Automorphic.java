import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sq = n*n;
        int temp = n;

        while(temp>0){
            count++;
            temp = temp/10;
        }

        int ld = (int)(sq%(Math.pow(10,count)));
        if(n==ld){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
