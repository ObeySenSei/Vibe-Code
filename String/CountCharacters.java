package String;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter your Characters: ");
        String str = in.nextLine();

        int totalCharacters = charCount(str);
        System.out.println("The total no. of characters in your string: " + totalCharacters);
        
    }
    static int charCount (String str){

        return str.length();   // using str.length function
    }

    static int countCharacters(String str) {

    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        count++;
        }
        return count;
    }
}
