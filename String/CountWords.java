public class CountWords {
    public static void main(String[] args) {

        String str = "I love learning Java";
        int ans = countWords(str);
        System.out.println("The no. of words in the String: " + ans);

    }
    static int countWords (String str){
        
        int length = 0;

        if (str.length() == 0){
            return length;
        }
        str = str.trim();           // removes whitespaces before the characters

        String[] words = str.split("\\s+");
        
        return words.length;           // returns the no. of elements in the array i.e 4
        
    }
    
}
