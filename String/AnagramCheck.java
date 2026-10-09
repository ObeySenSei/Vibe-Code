// Approach #1
public class AnagramCheck {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        boolean result = checkAnagram (str1, str2);
        if (result){
            System.out.println("The given string is an Anagram.");
        } else {
            System.out.println("The given string is not an Anagram.");
        }
    }
    static boolean checkAnagram (String str1, String str2){

        if (str1.length() != str2.length()){
            return false;
        }

        for (int i=0; i < str1.length(); i++){

            int appearance1 = 0; 
            int appearance2 = 0;   // occurrences of the current character in str1 and str2

            char ch = str1.charAt(i);
                
            for (int j=0; j<str1.length(); j++){                // Count occurrences in str1
                if ( ch == str2.charAt(j)){
                    appearance1++;
                }
            }
            for (int k=0; k <str2.length(); k++){                   // Count occurrences in str1
                if ( ch == str1.charAt(k)){
                    appearance2++;
                }
            }
            if (appearance1 != appearance2){              // If frequencies differ, not they are not anagrams
                return false;                      
            }
        }
        return true;                                      // Every character passed the frequency check
    }
}
/* 
Approach 2: Sort both strings


import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        System.out.println(checkAnagram(str1, str2));
    }

    static boolean checkAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);               // eilnst       
        Arrays.sort(arr2);               // eilnst

        return Arrays.equals(arr1, arr2);           if arr1 == arr2; return true; else return false 
    }
}

Approach 3: Frequency Array  

Count characters from the first string by adding 1, then count characters from the second string by subtracting 1.

public class AnagramCheck {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        System.out.println(checkAnagram(str1, str2));
    }

    static boolean checkAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq = new int[26];          value of z in ASCII is 26 (small z)

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}

*/