public class Var_arguments {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1,2));
        System.out.println(sum(4,5,6));
    }

    public static int sum(int ...arr){
        int res = 0;
        for(int a:arr){
            res =+a;
        }
       return res;
    }

}

//if you want to pass a compulsory value to be in the method, pass in the method and replace int res with x