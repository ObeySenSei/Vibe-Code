public class OccurenceOfCharater {
    public static void main(String[] args) {

        String str = "banana";
        char ch = 'a';

        int Occurence = checkOccurence( str, ch);   // When calling a method, you pass the actual variables, not their data types.
        System.out.println("The character "+ ch + " appears: "+ Occurence + " times.");
        
    }
    static int checkOccurence (String str, char ch){

        int count = 0;

        for (int i=0; i < str.length(); i++){
            if (str.charAt(i)== ch){         //  Compare the character returned by str.charAt(i) directly with your parameter ch.
                count++;
            }
        }
        return count;
    }
    
}
