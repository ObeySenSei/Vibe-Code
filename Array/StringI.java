import java.util.Arrays;
import java.util.Scanner;

public class StringI {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 characters: ");

        // Create String array
        String[] str = new String[5];

        // Take input
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
       
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        // Other way to Print the entire array
        System.out.println(Arrays.toString(str));

        in.close();
    }
}