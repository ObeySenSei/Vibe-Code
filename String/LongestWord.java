public class LongestWord {
    public static void main(String[] args) {

        String str = "I am learning programming";
        String longest = checkWord (str);
        System.out.println("The longest word in the String is: " + longest);
    }
    static String checkWord(String str){

        str = str.trim();
        String[] word = str.split("\\s+");

        String longest = word [0];               // We initialize longest with the first word

        for (int i=0; i<word.length; i++){
            if ( word[i].length() > longest.length()){     // Think about it: if words[i] is "learning" and longest is "am", what should you assign to longest inside the if block?
                longest = word[i];                      // The longest word would be the "learning"
            }
        }
        return longest;  
    }
    
}
