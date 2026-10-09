import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = in.nextInt();

        int reverse = 0;

        while (num > 0) {

            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        System.out.println("Your number in reverse: " + reverse);

        /*
         * MAIN LOGIC:
         * Suppose num = 1234
         * 1234 % 10 = 4
         * 1234 / 10 = 123
         * reverse = 0 * 10 + 4 = 4
         * Next:
         * 123 % 10 = 3
         * 123 / 10 = 12
         *
         * reverse = 4 * 10 + 3 = 43
         *
         * Next:
         * 12 % 10 = 2
         * 12 / 10 = 1
         *
         * reverse = 43 * 10 + 2 = 432
         *
         * Next:
         * 1 % 10 = 1
         * 1 / 10 = 0
         *
         * reverse = 432 * 10 + 1 = 4321
         *
         * So:
         * 1234 → 4321
         */
    }
}