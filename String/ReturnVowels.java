package String;

public class ReturnVowels {
    public static void main(String[] args) {
        
        String str = "Programming";
        int result = checkVowels (str);
        System.out.println("The no. of vowels in the string: " + result);
    }
    static int checkVowels(String str){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
            }
        } 
        return count;
    }
}
