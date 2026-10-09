import java.util.Scanner;
public class PalindromeMethod {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        System.out.println("Enter a word: ");
        String word = in.nextLine();                              // Can also take in Numbers


        if (isPalindrome(word)){
            System.out.println( word + " is a Palindrome!");
        } else {
            System.out.println( word + " is not a Palindrome!");
        }
    }

    static boolean isPalindrome (String cword){                   // String is the type of data to be passed here !!
 
    for ( int i = 0; i < cword.length () / 2; i++){
        if ( cword.charAt(i) != cword.charAt(cword.length() - 1 - i)){        // if (characters don't match)  ,   return false;
            return false;
        }
    }
    return true;
    }
    
}
