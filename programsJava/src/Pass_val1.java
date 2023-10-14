
// shows how pass by value works in strings

import java.util.Scanner;

public class Pass_val1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");

        String name = sc.next();
        String res = myGreet(name);
        System.out.println(res);
        sc.close();
    }

    static String myGreet(String naam) {
        return " hello" + naam;
        
    }
}
