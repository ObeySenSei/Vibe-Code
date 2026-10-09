public class RepeatedCharacter {
    public static void main(String[] args) {
        
        String str = "programming";
        char result = checkRepeatedCharacter (str);
        System.out.println("The first repeated character in the String " + "'" + str + "'" + " is: " + result);  // commas lol !
    }
    static char checkRepeatedCharacter (String str){

        int timesRepeated = 0;
        
        for (int i=0; i < str.length(); i++){
            char repeatedChar = str.charAt(i);      // We select the character at index i(0) initially.

            for(int j=i+1; j<str.length(); j++){   // We compare the character at index i with the character at index j (i+1)
                if (str.charAt(i) == str.charAt(j)){
                    return str.charAt(i);
                    }
                } 
            }
        return '\0';             // Return a special character such as '\0' to indicate that no repetition was found.
    }
    
}
