package String;

public class CountDigitLetters {
    public static void main(String[] args) {
        String str = "abc123de45";
        checkStr(str);

    }
    static void checkStr (String str){

        int digit = 0;
        int letter = 0;

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);

            if (Character.isLetter(ch)){
                letter++;
            }
            if (Character.isDigit(ch)){
                digit++;
            }
        }
        System.out.println("Number of letters in the string: " + letter);
        System.out.println("Number of digits in the string: " + digit);
    }
}
/* 
    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
    letters++;
} 
    if (ch >= '0' && ch <= '9') {
    digits++;
}

*/
