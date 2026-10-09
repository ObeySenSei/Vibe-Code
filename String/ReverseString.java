package String;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        String reverse = printReverseString(str);
        System.out.println("The string in Reverse: " + reverse); 
    
    }
    static String printReverseString (String str){

        String reverse = " ";
        for (int i = str.length() - 1 ; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}
