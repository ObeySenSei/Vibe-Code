// A string is a palindrome if it reads the same forward and backward

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.next();

        boolean palindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        in.close();
    }
}

/*str.charAt(i) means means give me the character at the front 
str.charAt(str.length() - 1 - i) means give me the corresponding character from the back. The -1 is because indexes start at 0.
 */