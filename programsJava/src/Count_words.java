public class Count_words {
    public static void main(String[] args) {
        String greet = "hello i am java core";
        int word = 1;

//        the if condition is fullfilled only (counts a word) when a gap is found
        for(int i = 0; i<greet.length()-1; i++){
            if(greet.charAt(i)== ' ' && greet.charAt(i+1)!=' '){
                word++;
            }
        }
        System.out.println(word);
    }
}
