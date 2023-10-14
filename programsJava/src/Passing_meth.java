
// this program shows how to pass a method in another method as arguments
public class Passing_meth {
    public static void main(String[] args) {
        Passing_meth m = new Passing_meth();
        m.mul(m.add(4, 5));
    }

    // this method will act as argument inside another method
    public int add(int x, int y) {
        return x + y;
    }

    // this method will print the above method
    public void mul(int d) {
        int res = d * d;
        System.out.println(res);
    }

}