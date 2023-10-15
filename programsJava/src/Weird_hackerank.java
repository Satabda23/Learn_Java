//if n is odd, print weird && if n is even and inclusive of 2 to 5, print not weird
// if n is even and inclusive range of 6 to 20, print weird
// if n is even and greater than 20, print not weird.

import java.util.Scanner;

public class Weird_hackerank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0){
            if(n>=2 && n<=5 || n>20){
                System.out.println("not weird");
            }
            else{
                System.out.println("wierd");
            }

        }
        else{
            System.out.println("weird");
        }
    }
}
