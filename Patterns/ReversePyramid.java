
public class ReversePyramid {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * (5 - i) + 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
