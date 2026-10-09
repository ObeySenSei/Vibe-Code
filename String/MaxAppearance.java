public class MaxAppearance {
    public static void main(String[] args) {

        String str = "banana";
        char result = maxAppearance (str);
        System.out.println("The most repeated character in the String: " + result);
        
        int count = countAppearance(str, result); // result has a character inside it !
        System.out.println("'" + result + "' appeared " + count + " times.");

    }
    static char maxAppearance(String str){
        
        char mostAppeared = str.charAt(0);     // lets assume its the most appeared character in the String
        int maxAppearance = 0;
        
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int appearance = 0;

            for (int j=0; j<str.length(); j++){
                if (ch == str.charAt(j)){
                    appearance++;
                   }
                }
            
            if (appearance > maxAppearance){
                maxAppearance = appearance;
                mostAppeared = ch;
            }
        }
        return mostAppeared;
    }
    static int countAppearance(String str, char ch) {
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ch) {
            count++;
           }
        }
    return count;
    }  
}
