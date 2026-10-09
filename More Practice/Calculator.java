import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter mode of operation: ");
        int ans = 0;

        while (true) {

            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("Enter first num: ");
                int num1 = in.nextInt();
                System.out.println("Enter second num: ");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }

            System.out.println("The result is : " + ans);

            } else if ( op=='x' || op == 'X'){
                break;
            } else {
                System.out.println( "Invalid Operation !");
            }
        }
    }
}

// while (true) means the calculator never stops unless you terminate the program manually.