public class ReverseWord {
    public static void main(String[] args) {

        String str = "I love learning Java";
        System.out.println("Original String: "+ str);

        String ans = reverseWords(str);
        System.out.println("The original string is reverse: " + ans);
    }
    static String reverseWords (String str){

       str = str.trim();          // remove whitespace

        String[] words = str.split("\\s+");
        String reverse = "";    // To negate leading space to your result. initialize it with an empty string instead

        for (int j=0; j < words.length; j++){                     // This visits each word in the array.
            for (int i = words[j].length() - 1 ; i >= 0; i--){       // for a single word 
            reverse = reverse + words[j].charAt(i);
            }
            
            if (j < words.length - 1) {
            reverse = reverse + " ";                    // It adds a space between words, but not after the final word.
            }
        }
        return reverse;
    } 
}
