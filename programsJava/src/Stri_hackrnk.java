//Given two strings of lowercase English letters, A  and B, perform the following operations:
//
//Sum the lengths of A and B .
//Determine if A is lexicographically larger than B  (i.e.: does A come before B in the dictionary?).
//Capitalize the first letter in A and B and print them on a single line, separated by a space.

import java.util.Scanner;

public class Stri_hackrnk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

//        prints the lengths of the strings and add them
        System.out.println(A.length() + B.length());

//        compare whether A lies before B or not
        int C = A.compareTo(B);
        if (C < 0) {
            System.out.println("No");
        } else if (C == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

//        replace method is used to replace the first letter of the string of both the words
        System.out.println(A.replace(A.substring(0, 1), A.substring(0, 1).toUpperCase()) + " " + B.replace(B.substring(0, 1), B.substring(0, 1).toUpperCase()));
    }
}
