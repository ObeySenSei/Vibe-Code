import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = in.next().trim();

        System.out.println("The alphabet at index 2 of the given word is " + word.charAt(2));
        

        // Example 2 

        System.out.println("Enter a Character");
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println (ch +" is a Lowercase Character");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println (ch + " is an Uppercase Character");
        } else {
            System.out.println ("Neither");
        }

        in.close();
    }
}