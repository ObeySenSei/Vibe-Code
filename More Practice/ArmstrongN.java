import java.util.Scanner;

public class ArmstrongN {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your starting number: ");
        int start = in.nextInt();

        System.out.println("Enter your ending number: ");
        int end = in.nextInt();

        System.out.println("Armstrong numbers: ");

        for (int i = start; i <= end; i++) {

            int num = i;
            int count = 0;
            int sum = 0;

            // Count the number of digits
            while (num > 0) {                 
                num = num / 10;                // I found one digit, so count it, then remove it.
                count++; 
            }
            // Again store a copy of i
            num = i;
            // Calculate Armstrong sum
            while (num > 0) {

                int digit = num % 10;
                sum = sum + (int)Math.pow(digit, count);
                num = num / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
        in.close();
    }
}