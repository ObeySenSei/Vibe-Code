import java.util.Scanner;

public class PerfectNumInput {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter starting number:");
        int start = in.nextInt();

        System.out.println("Enter ending number:");
        int end = in.nextInt();

        for (int num = start; num <= end; num++) {

            int sum = 0;

            for (int i = 1; i < num; i++) {

                if (num % i == 0) {
                    sum = sum + i;
                }
            }

            if (sum == num) {
                System.out.println(num + " is a Perfect Number!");
            }
        }

        in.close();
    }
}