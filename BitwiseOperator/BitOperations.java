package BitwiseOperator;

public class BitOperations {
    public static void main(String[] args) {
        int n = 68; // Example number
        int i = 5;  // Example bit position (1-indexed from right)

        System.out.println("2. The " + i + "th bit of " + n + " is: " + findIthBit(n, i));
        System.out.println("3. After setting the " + i + "th bit: " + setIthBit(n, i));
        System.out.println("4. After resetting the " + i + "th bit: " + resetIthBit(n, i));
        System.out.println("5. Rightmost set bit (value): " + rightmostSetBit(n));
    }

    // Find the i-th bit of a number (returns 0 or 1)
    static int findIthBit(int n, int i) {
        return (n & (1 << (i - 1))) == 0 ? 0 : 1;
    }

    // Set the i-th bit to 1
    static int setIthBit(int n, int i) {
        return n | (1 << (i - 1));
    }

    // Reset the i-th bit to 0
    static int resetIthBit(int n, int i) {
        return n & ~(1 << (i - 1));
    }

    // Find the rightmost set bit
    static int rightmostSetBit(int n) {
        return n & (-n);
    }
}