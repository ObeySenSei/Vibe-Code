// Input currency in rupees and output in USD.

import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        System.out.println("Enter Ruppees: ");
        double ruppee = in.nextDouble();

        double usd = ruppee * 0.010;
        System.out.println(ruppee + " INR in USD is approximately: $" + usd);

    }
}
