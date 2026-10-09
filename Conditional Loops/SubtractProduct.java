// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;
public class SubtractProduct {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = in.nextInt();

        int sum = 0;
        int product = 1;        // Since anything Multiplied by 0 is 0.

        while (num>0) {
            int digit = num % 10;          // takes the last digit
            sum = sum + digit;
            product = digit * digit;
            num = num/10;                  // remove the last digit
        }
            int ans = product - sum;
            System.out.println("The Product and Sum of Digits of " + num + " is: "+ ans);
            in.close();
    }
    
}
