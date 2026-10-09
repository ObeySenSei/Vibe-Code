import java.util.Scanner;

public class SumOfNNaturalNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the natural number up to which you want the sum: ");
        int num = in.nextInt();

        int sum = calculateSum(num);

        System.out.println("The sum of the natural numbers up to " + num + " is: " + sum);
    }

    static int calculateSum(int num) {

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }

        return sum;
    }
}