import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number with 3 digits or more: ");
        int num = in.nextInt();

        int count = 0;
        int sum = 0;
        int temp = num;                        // Because our program needs to use the number twice.

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        if (count < 3) {
            System.out.println("Enter a valid number !");

        } else {
            while (num > 0) {                       // Keep repeating the code inside the loop as long as num is greater than 0.
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            System.out.println("Sum of digits = " + sum);
        }
    }
}