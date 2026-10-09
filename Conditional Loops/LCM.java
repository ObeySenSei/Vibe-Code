import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = in.nextInt();

        System.out.println("Enter second number:");
        int num2 = in.nextInt();

        int lcm;

        if (num1 > num2) {
            lcm = num1;
        } else {
            lcm = num2;
        }

        while (true) {

            if (lcm % num1 == 0 && lcm % num2 == 0) {          // 36%12 = 3 i.e remainder 0 and 36%18 = 2 i.e remainder 0.
                break;
            }

            lcm++;
        }

        System.out.println("LCM = " + lcm);

        in.close();
    }
}

/*
        int lcm = 1;

        for (int i = 1; i <= num1 * num2; i++) {

            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }

*/