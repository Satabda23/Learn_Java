// check whether at any index, vowel or consonant is present or not and count both of the ccount and vcount
public class Alphabets_count {
    public static void main(String[] args) {
        String name = "Satabda";
        String str = name.toLowerCase();

        int cCount = 0;
        int vCount = 0;

        for(int i =0; i<name.length(); i++){
            if(name.charAt(i)=='a' || name.charAt(i)=='i' || name.charAt(i)=='e' || name.charAt(i)=='o' || name.charAt(i)=='u'){
                vCount++;
            }
            else if(name.charAt(i)>='a' && name.charAt(i)<='z'){
                cCount++;

            }
        }
        System.out.println("no of vowels: "+vCount+ "no of consonants: "+cCount);
    }
}
