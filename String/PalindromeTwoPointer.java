package String;

import java.util.Scanner;

public class PalindromeTwoPointer {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        boolean isPalindrome = checkPalindrome(str);
        if (isPalindrome){
            System.out.println("The given String is a Palindrome.");
        } else {
            System.out.println("The given String is not a Palindrome.");
        }
        
    }
    static boolean checkPalindrome (String str){

        int i=0;
        int j=str.length() - 1;

        while (i<j){             // While the index of i is less than index of j
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
/* 

for (int i = 0; i < str.length() / 2; i++) {
    
    if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return false;
    }
}

return true;


static boolean isPalindrome(String str) {

    String reverse = "";

    for (int i = str.length() - 1; i >= 0; i--) {
        reverse = reverse + str.charAt(i);
    }

    return str.equals(reverse);  means if str == reverse;  return reverse;
}

*/