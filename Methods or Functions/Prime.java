import java.util.Scanner;
public class Prime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        boolean ans = isPrime(n);

        System.out.println(ans);
    }

    static boolean isPrime(int n) {    // Give me an integer and I'll return either true or false.

        if (n <= 1) {                  // A prime number must be greater than 1.
            return false;
        }
        
        int c = 2;

        while (c * c <= n) {           // Keep checking divisors while c² is less than or equal to n.

            if (n % c == 0) {          // checks whether 17 is exactly divisible by 2, 3, or 4.
                return false;
            }
            c++;
        }

        return true;
    }
}