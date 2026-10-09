import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        // Print numbers from 1 to 5

        for (int num = 1; num <= 5; num++) {
            System.out.println(num);
        }

        // Print numbers from 1 to n

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = in.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.println(num);
        }

        // Print Hello World n number of times

        System.out.println("Enter the no. of times you want to print: ");
        int no = in.nextInt();

        for (int num = 1; num <= no; num++) {
            System.out.println("Hello World");
        }
    }
}