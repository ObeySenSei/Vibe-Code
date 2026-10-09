public class NonRepeatCharacter {
    public static void main(String[] args) {
        
        String str = "swiss";

        char result = checkCharacter(str);
        if (result == '\0') {
        System.out.println("No non-repeating character found.");
        } else {
        System.out.println("First non-repeating character: " + result);
        }
    }
    static char checkCharacter (String str){

        for (int i=0; i<str.length(); i++){
            boolean nonRepeatedChar = true;     // We assume that the character at index i[0] hasnt reepated.
            char ch = str.charAt(i);

            for (int j=0; j<str.length(); j++){
                if ( i != j && str.charAt(i) == str.charAt(j)){
                    nonRepeatedChar = false;
                    break;
                }
            }
            if (nonRepeatedChar) {       // Finish checking the selected character against the entire string before deciding 
                return ch;               //                  that it is unique.
            }
        }
        return '\0';
    }
}

/* 
for (int j=0; j<str.length(); j++){

the second 's' is at index 3, but its duplicate exists at index 0. 
If we only checked characters to the right, we could miss that earlier duplicate. 
So we dont use j=i+1 logic

i != j
The two indices must be different.
Otherwise, when i = 0 and j = 0, the character 's' would match itself. We don't want to count that as a repetition!

*/
