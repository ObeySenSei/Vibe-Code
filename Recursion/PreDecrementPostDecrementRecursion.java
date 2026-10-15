package Recursion;

public class PreDecrementPostDecrementRecursion {

    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 0) {
            System.out.println("Base case reached!");
            return;
        }

        System.out.println("Before recursive call: n = " + n);

        fun(--n);       // fun(n--) will give an error. Why ? Check my Interview Prep PDF
        System.out.println("After recursive call: n = " + n);
    }
}