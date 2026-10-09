import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number to check if it's a Perfect Number:");
        int num = in.nextInt();

        int sum = 0;

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect Number!");
        } else {
            System.out.println(num + " is not a Perfect Number!");
        }

        in.close();
    }
}