import java.util.Scanner;

public class Temperrature {
    public static void main (String [] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Please enter a temperature in Celcius: ");

        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;       // (tempC * 1.8f) + 32;

        System.out.println(tempF);  

    }
    
}
