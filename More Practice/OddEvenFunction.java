import java.util.Scanner;

public class OddEvenFunction {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = in.nextInt();

        if (Check(num)) {                                           // Here Java effectively sees [if true]
            System.out.println(num + " is an even number!");
        } else {
            System.out.println(num + " is an odd number!");
        }
    }

    static boolean Check(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
} 

/*
false specifically tells Java "don't execute the IF block; go to ELSE."
*/