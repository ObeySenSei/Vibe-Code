
public class Power {
    public static void main(String[] args) {

        // Calculate 2^3
        double base = 2.0;
        double exponent = 3.0;
        
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Working with integers (Requires Type Casting)

        int intBase = 5;
        int intExponent = 2;
        int intResult = (int) Math.pow(intBase, intExponent); 
        System.out.println(intBase + "^" + intExponent + " = " + intResult);
    }
}

