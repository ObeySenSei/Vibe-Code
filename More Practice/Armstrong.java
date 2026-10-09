// An Armstrong number is a number that equals the sum of its own digits each raised to the power of the total number of digits. 
// For example, 153 is an Armstrong number because (1^3 + 5^3 + 3^3 = 153).

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your starting number: ");
        int start = in.nextInt();

        System.out.println("Enter your ending number: ");
        int end = in.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are: ");

        for (int i = start; i <= end; i++) {

            int num = i;       // Store the number, for example 153
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;       // Get the last digit: 3, 5, 1
                sum = sum + digit * digit * digit;
                num = num / 10;             // Remove the last digit
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
        in.close();
    }
}

/*

So mentally, you can remember:

% 10 = TAKE the last digit
/ 10 = REMOVE the last digit
If a number has N digits, raise every digit to the power N, then add them. So in this case since we are checking for only 3 digit armstrong numbers,
we use the formula  digit * digit * digit;

 */