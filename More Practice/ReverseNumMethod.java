import java.util.Scanner;
 public class ReverseNumMethod {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int num = in.nextInt();

        int Reverse = calculateReverse(num);                               // Method Call - Java passes the value 1234 into n
        System.out.println(num + " in reverse is: " + Reverse);            

    }
    
    static int calculateReverse (int n){

        int digits = 0;

        while (n>0) {

            int remainder = n % 10;                         //  1234 % 10 = 4
            digits = digits * 10 + remainder;               //  digits = 0 * 10 + 4
            n = n / 10;                                     //  1234 / 10 = 123

        }
        return digits;
    }
    
}
