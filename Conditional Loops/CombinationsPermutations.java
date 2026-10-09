import java.util.Scanner;
public class CombinationsPermutations {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = in.nextInt();

        System.out.println("Enter r:");
        int r = in.nextInt();

        int factN = 1;
        int factR = 1;
        int factNR = 1;

        // n!
        for (int i = 1; i <= n; i++) {
            factN = factN * i;
        }

        // r!
        for (int i = 1; i <= r; i++) {
            factR = factR * i;
        }

        // (n-r)!
        for (int i = 1; i <= n - r; i++) {
            factNR = factNR * i;
        }

        int ncr = factN / (factR * factNR);

        int npr = factN / factNR;

        System.out.println("NCR = " + ncr);
        System.out.println("NPR = " + npr);

        in.close();
    }
}